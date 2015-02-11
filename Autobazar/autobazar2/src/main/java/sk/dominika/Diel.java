package sk.dominika;

import java.math.BigDecimal;

public class Diel {

    private int ID = -1;
    private String druh;
    private String podkategoria;
    private BigDecimal cena;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public String getPodkategoria() {
        return podkategoria;
    }

    public void setPodkategoria(String podkategoria) {
        this.podkategoria = podkategoria;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }
}
