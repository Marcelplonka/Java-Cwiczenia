package pl.plonka.marcel.fourth;

import java.util.Scanner;

public class ZadanieTrójelementowa {
    private static int[] num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = new int[3];

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();

        int result = max();
        System.out.println(result);
    }

    static int max() {
        return Math.max(num[0], Math.max(num[1], num[2]));
    }
}
