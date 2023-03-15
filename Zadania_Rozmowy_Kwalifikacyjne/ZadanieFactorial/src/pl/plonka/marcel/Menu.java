package pl.plonka.marcel;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        FactorialWithLoop fl = new FactorialWithLoop();
        FactorialWithRecursion fr = new FactorialWithRecursion();

        boolean isWork = true;

        while (isWork) {
            System.out.println("What do you want?");
            System.out.println("1. Calculate factorial with loop.");
            System.out.println("2. Calculate factorial with recursion.");
            System.out.println("3. Exit.");
            System.out.println();

            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter a number: ");
                    fl.setFactorialNumber(sc.nextInt());
                    fl.printResult();
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Enter a number: ");
                    fr.setFactorialNumber(sc.nextInt());
                    fr.printResult();
                    System.out.println();
                }
                case 3 -> {
                    isWork = false;
                }
                default -> {
                    System.out.println("Undefined Operation.");
                    System.out.println();
                }

            }
        }
    }
}
