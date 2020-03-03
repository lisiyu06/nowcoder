package day_02;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/3
 */

// 汽水瓶
    // 递归
    // 1 个空瓶 = 0 瓶汽水 + 0 个空瓶
    // 2 个空瓶 = 1 瓶汽水 + 0 个空瓶
    // 3 个空瓶 = 1 瓶汽水 + 1 个空瓶
    // f(1) = 0
    // f(2) = 0
    // f(3) = 1
    // f(4) = f(3 + 1)
    //      = 1 瓶汽水 + 2 个空瓶
    //      = 1 + f(2)
    //      = 2 瓶汽水 + 0 个空瓶
    // f(5) = f(3 + 2)
    //      = 1 瓶汽水 + 3 个空瓶
    //      = 1 + f(3)
    // f(n) = 1 + f(n - 2)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            System.out.println(Drink(n));
        }
    }
    private static int Drink(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return Drink(n - 2) + 1;
    }
}
