package day_01;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/3
 */

// 统计回文

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            int count = 0;
            for (int i = 0; i <= A.length(); i++) {
                String str = A.substring(0, i) + B + A.substring(i, A.length());
                StringBuffer sb = new StringBuffer(str);
                if (sb.reverse().toString().equals(str)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
