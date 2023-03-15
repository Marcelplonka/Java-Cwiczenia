package pl.plonka.marcel;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ile liczb chcesz zsumowac?");
        int length = sc.nextInt();
        int[] numbers = new int[length];

        System.out.println("\nWprowadz liczby.");
        int checkLength = 0;
        while(checkLength < numbers.length) {
            numbers[checkLength] = sc.nextInt();
            checkLength++;
        }

        int result = arraySum(numbers, numbers.length);
        System.out.println("Suma wprowadzonych liczb wynosi: " + result);
    }

    public static int arraySum(int[] numbers, int length) {
        if(length <= 0) {
            return 0;
        }
        return numbers[length - 1] + arraySum(numbers, length - 1) ;
    }
}
