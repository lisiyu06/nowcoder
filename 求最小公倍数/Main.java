package day_07;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/15
 */

// 求最小公倍数

public class Main {

    public static int lcm(int m, int n) {
        return (m * n) / gcd(m, n);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(lcm(a, b));
    }
}
