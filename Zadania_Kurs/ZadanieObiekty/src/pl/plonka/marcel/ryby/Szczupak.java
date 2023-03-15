package pl.plonka.marcel.ryby;

public class Szczupak {
    private double waga;
    private double dlugosc;

    public Szczupak() {

    }

    public Szczupak(double waga, double dlugosc) {
        this.waga = waga;
        this.dlugosc = dlugosc;
    }

    public String jakosc() {
        return "Szczupak jest średniej jakości!";
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }
}
