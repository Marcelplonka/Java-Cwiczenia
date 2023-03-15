package pl.plonka.marcel;

import pl.plonka.marcel.ryby.*;
import pl.plonka.marcel.ssaki.*;

public class Main {
    private static Szczupak szczupak;
    private static Łosoś łosoś;
    private static Kot kot;
    private static Pies pies;

    public Main() {
        szczupak = new Szczupak(10.5,80);
        łosoś = new Łosoś(12, 65.5);
        kot = new Kot(10, 10);
        pies = new Pies(15, 30);
    }

    public Main(Szczupak szczupak, Łosoś łosoś, Kot kot, Pies pies) {
        this.szczupak = szczupak;
        this.łosoś = łosoś;
        this.kot = kot;
        this.pies = pies;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Pies: " + main.pies.głos());
        System.out.println("Dane psa -> wiek: " + main.pies.getWiek() + " waga: " + main.pies.getWaga() + "\n");
        System.out.println("Kot: " + main.kot.głos());
        System.out.println("Dane kot -> wiek: " + main.kot.getWiek() + " waga: " + main.kot.getWaga() + "\n");
        System.out.println("Łosoś: " + main.łosoś.jakosc());
        System.out.println("Dane łososia -> długość: " + main.łosoś.getDlugosc() + " waga: " + main.łosoś.getWaga() + "\n");
        System.out.println("Szczupak: " + main.szczupak.jakosc());
        System.out.println("Dane szczupaka -> długość: " + main.szczupak.getDlugosc() + " waga: " + main.szczupak.getWaga() + "\n");
    }
}
