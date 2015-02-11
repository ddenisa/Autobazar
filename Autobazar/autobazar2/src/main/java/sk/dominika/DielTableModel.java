package sk.dominika;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DielTableModel extends AbstractTableModel {

    private static final int POCET_STLPCOV = 3;
    private DielDao dielDao = DaoFactory.INSTANCE.getDielDao();
    private List<Diel> diely = new LinkedList<>();
    private static final String[] NAZVY_STLPCOV = {"Druh", "Podkategória", "Cena"};
    private static final Class[] TYPY_STLPCOV = {String.class, String.class, BigDecimal.class};

    @Override
    public int getRowCount() {
        return diely.size();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Diel diel = diely.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return diel.getDruh();
            case 1:
                return diel.getPodkategoria();
            case 2:
                return diel.getCena();

            default:
                return "???";
        }

    }

   public void obnov() {
        diely = dielDao.dajVsetky();
        fireTableDataChanged();
    }

    public Diel dajPodlaCislaRiadku(int riadok) {
        return diely.get(riadok);
    }

    @Override
    public String getColumnName(int column) {
        return NAZVY_STLPCOV[column];
    }

    public Class<?> getColumnClass(int columnIndex) {
        return TYPY_STLPCOV[columnIndex];
    }
}
