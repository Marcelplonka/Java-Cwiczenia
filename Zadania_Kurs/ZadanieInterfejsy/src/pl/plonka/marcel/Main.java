package pl.plonka.marcel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldAdding()) {
            computation = new Add();
        } else {
            computation = new Sub();
        }

        try {
            double argument1 = main.getArgument();
            double argument2 = main.getArgument();

            double result = computation.compute(argument1, argument2);
            System.out.println("Wynik: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Unknown value.");
        }
    }

    private boolean shouldAdding() {
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    return true;
                }
                case 2 -> {
                    return false;
                }
                default -> System.out.println("Unknown operation.\n");
            }
        }
    }
    private double getArgument() throws InputMismatchException{
        System.out.println("Enter the value: ");
        return sc.nextDouble();
    }
}