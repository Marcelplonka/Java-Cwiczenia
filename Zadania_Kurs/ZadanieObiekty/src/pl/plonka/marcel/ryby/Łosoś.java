package pl.plonka.marcel.ryby;

public class Łosoś {
    private double waga;
    private double dlugosc;

    public Łosoś() {

    }

    public Łosoś(double waga, double dlugosc) {
        this.waga = waga;
        this.dlugosc = dlugosc;
    }

    public String jakosc() {
        return "Łosoś jest najwyższej jakości!";
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
