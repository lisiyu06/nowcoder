package day_05;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/11
 */

// 神奇的口袋

public class Main {

    static int n;
    static int[] vol;
    static int sum = 0;

    public static void count(int rest, int n) {
        if (rest == 0) {
            sum++;
            return;
        }
        if (rest<0 || (rest>0 && n<1)) {
            return;
        }
        count(rest - vol[n], n-1);
        count(rest, n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            vol = new int[n+1];
        }
        for (int i = 1; i <= n; i++) {
            vol[i] = scanner.nextInt();
        }
        count(40, n);
        System.out.println(sum);
    }
}
