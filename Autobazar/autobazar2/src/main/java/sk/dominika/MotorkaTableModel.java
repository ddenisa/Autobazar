package sk.dominika;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MotorkaTableModel extends AbstractTableModel {

    private static final int POCET_STLPCOV = 4;
    private MotorkaDao motorkaDao = DaoFactory.INSTANCE.getMotorkaDao();
    private List<Motorka> motorky = new LinkedList<>();
    private static final String[] NAZVY_STLPCOV = {"Druh", "Značka", "Rok výroby", "Cena"};
    private static final Class[] TYPY_STLPCOV = {String.class, String.class, Integer.class, BigDecimal.class};

    @Override
    public int getRowCount() {
        return motorky.size();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Motorka motorka = motorky.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return motorka.getDruh();
            case 1:
                return motorka.getZnacka();
            case 2:
                return motorka.getRokVyroby();
            case 3:
                return motorka.getCena();
            default:
                return "???";
        }

    }

    public void obnov() {
        motorky = motorkaDao.dajVsetky();
        fireTableDataChanged();
    }

    public Motorka dajPodlaCislaRiadku(int riadok) {
        return motorky.get(riadok);
    }

    @Override
    public String getColumnName(int column) {
        return NAZVY_STLPCOV[column];
    }

    public Class<?> getColumnClass(int columnIndex) {
        return TYPY_STLPCOV[columnIndex];
    }
    
     public void dajMotorkuSTymtoIdDoKosika(int id, List<Motorka> zoznam){
        motorky = zoznam;
        fireTableDataChanged();
    }
}
