package day_02;

/**
 * Author: lisiyu
 * Created: 2020/3/3
 */

// 数组中的逆序对

public class AntiOrder {
    public int count(int[] A, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
