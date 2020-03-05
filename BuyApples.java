package day_04;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/5
 */

// 买苹果

public class BuyApples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num <= 5 || num % 2 != 0) {
                System.out.println(-1);
            }
            if (num % 8 == 0) {
                System.out.println(num / 8);
            } else {

            }
        }
    }
}
