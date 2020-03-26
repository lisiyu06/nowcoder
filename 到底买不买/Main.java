package day_22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/26
 */

// 到底买不买

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String shop = scanner.nextLine();
            String buy = scanner.nextLine();
            char[] shoparr = shop.toCharArray();
            char[] buyarr = buy.toCharArray();

            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < shoparr.length; i++) {
                if (!map.containsKey(shoparr[i])) {
                    map.put(shoparr[i], 1);
                } else {
                    map.put(shoparr[i], map.get(shoparr[i]) + 1);
                }
            }

            for (int i = 0; i < buyarr.length; i++) {
                if (map.containsKey(buyarr[i])) {

                }
            }

        }
    }
}
