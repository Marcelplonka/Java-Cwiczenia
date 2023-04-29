import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static boolean checkIfArmstrong(int number) {
        int length = Integer.toString(number).length();
        int temp = number;
        int armstrong = 0;

        if (number > 0 && number < 10)
            return true;

        while (temp > 0) {
            armstrong += Math.pow(temp % 10, length);
            temp /= 10;
        }

        return armstrong == number;
    }

    private static void printArmstrong(int range) {
        for (int i = 1; i <= range; i++) {
            if (checkIfArmstrong(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check if entered number is armstrong.");
        System.out.println("2. Print all armstrong number in the range.");
        int operation = sc.nextInt();

        try {
            switch (operation) {
                case 1 -> {
                    System.out.println("Enter a value: ");
                    int number = sc.nextInt();

                    if (checkIfArmstrong(number)) {
                        System.out.println("Armstrong number");
                    } else {
                        System.out.println("Not armstrong number");
                    }
                }
                case 2 -> {
                    System.out.println("Enter a range: ");
                    int range = sc.nextInt();

                    printArmstrong(range);
                }
                default -> System.out.println("Incorrect operation");
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
        }
    }
}
