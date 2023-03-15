package pl.plonka.marcel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    private static boolean works = true;

    private final static ArrayList<Integer> primeNumber = new ArrayList<>();

    public static void main(String[] args) {
        while (works) {
            menu();
            System.out.println();
        }
    }
    static void menu() {
        System.out.println("Wybierz operacje: ");
        System.out.println("1. Sprawdz czy dana liczba jest pierwsza.");
        System.out.println("2. Wypisz ciag liczb pierwszych.");
        System.out.println("3. Znajdz liczbe pierwsza pomiedzy dwoma innymi liczbami.");
        System.out.println("4. Wyjdz.");
        byte operation = sc.nextByte();

        switch (operation) {
            case 1 -> {
                System.out.println();
                System.out.println("Podaj liczbe do sprawdzenia.");
                int number = sc.nextInt();

                if (number == 2 || number == 3) {
                    System.out.println("Jest pierwsza");
                } else if (number == 0 || number == 1) {
                    System.out.println("Nie jest pierwsza.");
                } else {
                    checkIfPrime(number);

                    if (primeNumber.size() == 1) {
                        System.out.println("Jest pierwsza.");
                        primeNumber.clear();
                    } else {
                        System.out.println("Nie jest pierwsza.");
                    }
                }
            }
            case 2 -> {
                System.out.println();
                System.out.println("Podaj dlugosc ciagu liczb pierwszych.");
                int primeNumberLength = sc.nextInt();

                writePrimeNumber(primeNumberLength);
            }
            case 3 -> {
                System.out.println();
                System.out.println("Podaj wartosc poczatkowa.");
                int start = sc.nextInt();

                System.out.println("Podaj wartosc koncowa.");
                int end = sc.nextInt();

                if (start > end) {
                    System.out.println("Nieprawidlowe dane wejsciowe - wartosc poczatkowa nie moze byc wieksza od wartosci koncowej");
                    break;
                }

                writePrimeNumberBetweenNumber(start, end);
            }
            case 4 -> works = false;
            default -> System.out.println("Undefined operation.");
        }
    }

    // Modification of Eratosthenes' sieve algorithm

    static void writePrimeNumber(int primeNumberLength) {
        int number = 3;

        if (primeNumberLength >= 1) {
            primeNumber.add(2);
        }

        while (primeNumber.size() < primeNumberLength) {
            checkIfPrime(number);
            number+=2;
        }

        System.out.println(primeNumber);
        primeNumber.clear();
    }
    static void writePrimeNumberBetweenNumber(int start, int end) {
        int number = start;
        if (number < 2) number = 2;

        while (number <= end) {
            checkIfPrime(number);
            number++;
        }

        System.out.println(primeNumber);
        primeNumber.clear();
    }

    // Helping Method

    static void checkIfPrime(int number) {
        boolean isPrime = true;
        int sqrt = (int) Math.sqrt(number);

        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            primeNumber.add(number);
        }
    }
}
