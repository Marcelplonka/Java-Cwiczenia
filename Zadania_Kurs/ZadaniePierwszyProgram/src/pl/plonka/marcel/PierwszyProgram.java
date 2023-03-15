package pl.plonka.marcel;

import java.util.Scanner;

public class PierwszyProgram {
    static int dlugoscZdan;

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Jaka jest pogoda?");
            System.out.println("1. Ładna");
            System.out.println("2. Średnia");
            System.out.println("3. Brzydka");

            int wybor = sc.nextInt();
            System.out.println(wyborPogody(wybor));
        }
    }

    static String wyborPogody(int wybor) {
        String komunikatLadna = "Pogoda jest bardzo ładna. Przejawia się czystym niebem i wysoką temperaturą.";
        String komunikatSrednia = "Pogoda jest \"średnia\". Oznacza to że zachmurzenie jest częściowe wiatr daje się we znaki ale nie znaczy to, że nie można z tego powodu yjść na dwór.";
        String komunikatBrzydka = "Pogoda jest po prostu brzydka. Porywisty wiatr z deszczem a do tego dochodzą jeszcze grzmoty z oddali.";
        String komunikatWynik = "";
        short dlugoscKomunikatow = (short) (komunikatLadna.length() + komunikatSrednia.length() + komunikatBrzydka.length());

        switch (wybor) {
            case 1:
                komunikatWynik = komunikatLadna;
                break;
            case 2:
                komunikatWynik = komunikatSrednia;
                break;
            case 3:
                komunikatWynik = komunikatBrzydka;
                break;
            default:
                komunikatWynik = "Niezidentyfikowana pogoda ;_;";
        }
        return komunikatWynik + "\n" + "Długość wszystkich komunikatów wynosi " + dlugoscKomunikatow + "\n";
    }
}
