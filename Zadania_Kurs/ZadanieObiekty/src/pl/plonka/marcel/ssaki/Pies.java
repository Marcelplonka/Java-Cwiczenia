package pl.plonka.marcel.ssaki;

public class Pies {
    private int wiek;
    private double waga;

    public Pies() {

    }

    public Pies(int wiek, double waga) {
        this.wiek = wiek;
        this.waga = waga;
    }

    public String głos() {
        return "Hau hau!";
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
