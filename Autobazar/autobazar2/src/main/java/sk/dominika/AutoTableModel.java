package sk.dominika;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class AutoTableModel extends AbstractTableModel {
    private static final int POCET_STLPCOV = 4;
    private AutoDao autoDao = DaoFactory.INSTANCE.getAutoDao();
    private List<Auto> auta = new LinkedList<>();
    private static final String[] NAZVY_STLPCOV = {"Značka", "Model", "Rok výroby", "Cena"};
    private static final Class[] TYPY_STLPCOV = {String.class, String.class, Integer.class, BigDecimal.class};

    @Override
    public int getRowCount() {
        return auta.size();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Auto auto = auta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return auto.getZnacka();
            case 1:
                return auto.getModel();
            case 2:
                return auto.getRokVyroby();
            case 3:
                return auto.getCena();
            default:
                return "???";
        }
    }
    
    public void obnov() {
        auta = autoDao.dajVsetky();
        fireTableDataChanged();
    }
    
    public Auto dajPodlaCislaRiadku(int riadok) {
        return auta.get(riadok);
    }
    
    @Override
    public String getColumnName(int column) {
        return NAZVY_STLPCOV[column];
    }
    
    public Class<?> getColumnClass(int columnIndex) {
        return TYPY_STLPCOV[columnIndex];
    }
    
     public void dajAutoSTymtoIdDoKosika(int id, List<Auto> zoznam){
        auta = zoznam;
        fireTableDataChanged();
    }

   
}
