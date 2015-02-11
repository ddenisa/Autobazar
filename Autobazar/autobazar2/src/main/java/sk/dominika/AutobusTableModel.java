package sk.dominika;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AutobusTableModel extends AbstractTableModel {

    private static final int POCET_STLPCOV = 4;
    private AutobusDao autobusDao = DaoFactory.INSTANCE.getAutobusDao();
    private List<Autobus> autobusy = new LinkedList<>();
    private static final String[] NAZVY_STLPCOV = {"Druh", "Značka", "Rok výroby", "Cena"};
    private static final Class[] TYPY_STLPCOV = {String.class, String.class, Integer.class, BigDecimal.class};

    @Override
    public int getRowCount() {
        return autobusy.size();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Autobus autobus = autobusy.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return autobus.getDruh();
            case 1:
                return autobus.getZnacka();
            case 2:
                return autobus.getRokVyroby();
            case 3:
                return autobus.getCena();
            default:
                return "???";
        }

    }

    public void obnov() {
        autobusy = autobusDao.dajVsetky();
        fireTableDataChanged();
    }

    public Autobus dajPodlaCislaRiadku(int riadok) {
        return autobusy.get(riadok);
    }

    @Override
    public String getColumnName(int column) {
        return NAZVY_STLPCOV[column];
    }

    public Class<?> getColumnClass(int columnIndex) {
        return TYPY_STLPCOV[columnIndex];
    }
    
     public void dajAutobusSTymtoIdDoKosika(int id, List<Autobus> zoznam){
        autobusy = zoznam;
        fireTableDataChanged();
    }
}
