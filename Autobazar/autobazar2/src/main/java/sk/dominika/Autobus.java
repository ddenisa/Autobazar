package sk.dominika;

import java.math.BigDecimal;

public class Autobus {

    private int ID = -1;
    private String druh;
    private String znacka;
    private String model;
    private int rokVyroby;
    private int najazdeneKm;
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

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }

    public int getNajazdeneKm() {
        return najazdeneKm;
    }

    public void setNajazdeneKm(int najazdeneKm) {
        this.najazdeneKm = najazdeneKm;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

}

