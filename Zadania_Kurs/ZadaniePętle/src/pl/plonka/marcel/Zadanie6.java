package pl.plonka.marcel;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ile rzeczy chcesz zsumowac?");
        int lengthOfThings = sc.nextInt();

        int[][] numbers = new int[lengthOfThings][];

        for(int i = 0; i < lengthOfThings; i++) {
            System.out.println("\nIle liczb chcesz wprowadzic do rubryki " + (i + 1) + "?");
            int length = sc.nextInt();
            numbers[i] = new int[length];

            System.out.println("Wprowadz liczby do rubryki " +  (i + 1) + ".");
            for(int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        arraySum(numbers);
    }

    public static void arraySum(int[][] numbers) {
        int sumOfThings = 0;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                sumOfThings += numbers[i][j];
            }
            System.out.println("Suma wszystkich elementow z rubryki " + (i + 1) + " wynosi " + sumOfThings);
            sum += sumOfThings;
            sumOfThings = 0;
        }
        System.out.println("Suma wszystkich elementow wynosi " + sum);
    }
}
