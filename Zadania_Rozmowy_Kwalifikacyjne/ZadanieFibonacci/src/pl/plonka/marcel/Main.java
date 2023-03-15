package pl.plonka.marcel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long previous = 0L;
        long current = 1L;

        System.out.println("Ile skokow ma wykonac ciag?");
        int steps = sc.nextInt();

        if (steps == 0) {
            System.out.println("Wynik = " + previous);
        } else if (steps == 1) {
            System.out.println("Wynik = " + current);
        } else {
            System.out.println("Wynik = " + calculateFibonnacciItertively(previous, current, steps));
            System.out.println("Wynik = " + calculateFibonacciRecursively(previous, current, steps));
        }
    }

    public static long calculateFibonnacciItertively(long previous, long current, int steps) {
        for (int i = 2; i <= steps; i++) {
            long pom = previous + current;
            previous = current;
            current = pom;
        }
        return current;
    }

    public static long calculateFibonacciRecursively(long previous, long current, int steps) {
        if (steps == 1) {
            return current;
        }
        return calculateFibonacciRecursively(current, current + previous, steps - 1);
    }
}
