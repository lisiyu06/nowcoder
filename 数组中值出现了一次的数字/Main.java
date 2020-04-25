package web_01;

/**
 * Author: lisiyu
 * Created: 2020/4/25
 */

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 数组中值出现了一次的数字
 *
 */
public class Main {
    public void NumAppearOnceInArray(int[] array, int num1[], int num2[]) {
        if (array.length < 1) {
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!set.isEmpty() && set.contains(array[i])) {
                set.remove(array[i]);
            } else {
                set.add(array[i]);
            }
        }
        num1[0] = (int)set.toArray()[0];
        num2[0] = (int)set.toArray()[1];
    }
}