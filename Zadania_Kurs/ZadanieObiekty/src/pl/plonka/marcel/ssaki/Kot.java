package pl.plonka.marcel.ssaki;

public class Kot {
    private int wiek;
    private double waga;

    public Kot() {

    }

    public Kot(int wiek, double waga) {
        this.wiek = wiek;
        this.waga = waga;
    }

    public String głos() {
        return "Miau!";
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }
}
