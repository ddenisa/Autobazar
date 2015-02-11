package sk.dominika;

import java.math.BigDecimal;

public class Auto {
    private int ID = -1;
    private String znacka;
    private String model;
    private String palivo;
    private int rokVyroby;
    private int najazdeneKm;
    private int objemMotora;
    private String farba;
    private BigDecimal cena;
    private boolean abs;
    private boolean parkovaciaKamera;
    private boolean radio;
    private boolean tempomat;
    private boolean klimatizacia;
    private boolean tazneZariadenie;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPalivo(String palivo) {
        this.palivo = palivo;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }

    public void setNajazdeneKm(int najazdeneKm) {
        this.najazdeneKm = najazdeneKm;
    }

    public void setObjemMotora(int objemMotora) {
        this.objemMotora = objemMotora;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void setParkovaciaKamera(boolean parkovaciaKamera) {
        this.parkovaciaKamera = parkovaciaKamera;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public void setTempomat(boolean tempomat) {
        this.tempomat = tempomat;
    }

    public void setKlimatizacia(boolean klimatizacia) {
        this.klimatizacia = klimatizacia;
    }

    public void setTazneZariadenie(boolean tazneZariadenie) {
        this.tazneZariadenie = tazneZariadenie;
    }

    public String getZnacka() {
        return znacka;
    }

    public String getModel() {
        return model;
    }

    public String getPalivo() {
        return palivo;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public int getNajazdeneKm() {
        return najazdeneKm;
    }

    public int getObjemMotora() {
        return objemMotora;
    }

    public String getFarba() {
        return farba;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public boolean isAbs() {
        return abs;
    }

    public boolean isParkovaciaKamera() {
        return parkovaciaKamera;
    }

    public boolean isRadio() {
        return radio;
    }

    public boolean isTempomat() {
        return tempomat;
    }

    public boolean isKlimatizacia() {
        return klimatizacia;
    }

    public boolean isTazneZariadenie() {
        return tazneZariadenie;
    }

    
}
