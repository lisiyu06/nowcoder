package day_05;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/11
 */
public class Main {

    static int n;
    static int[] vol;

    public static int count(int rest, int n) {
        if (rest == 0) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        return count(rest-vol[n], n-1) + count(rest, n-1);
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
        System.out.println(count(40, n));
    }
}
