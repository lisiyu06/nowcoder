package day_07;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/16
 */

// 不要 2

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int evenICount = (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2);
        int oddICount = ((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2);
        int ans = m / 4 * (evenICount + oddICount) * 2;
        if(m % 4 > 0) ans += evenICount;
        if(m % 4 > 1) ans += evenICount;
        if(m % 4 > 2) ans += oddICount;
        System.out.println(ans);
    }
}
