package pl.plonka.marcel.first;

import java.util.Scanner;

public class ZadanieDwuelementowa {
    private static int[] num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = new int[2];

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();

        int result = sum();
        System.out.println(result);
    }

    static int sum() {
        return num[0] + num[1];
    }
}
