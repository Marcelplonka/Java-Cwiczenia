package pl.plonka.marcel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckPalindrome checkP = new CheckPalindrome();

        System.out.println("Enter a number to check.");

        checkP.setNumber(sc.nextInt());
        checkP.checkNumber();
    }
}
