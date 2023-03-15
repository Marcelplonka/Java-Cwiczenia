package pl.plonka.marcel;

import java.util.Scanner;

public class ZadanieMetody {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperature = sc.nextInt();
        checkTemp(temperature);
    }

    private static void checkTemp(int temp) {
        boolean isPositive = temp > 0;

        if(isPositive) {
            System.out.println("Temperatura " + temp + " jest dodatnia.");
        }
        else {
            System.out.println("Temperatura " + temp + " jest ujemna.");
        }
    }
}
