package day_01;

/**
 * Author: lisiyu
 * Created: 2020/3/3
 */

// 寻找第 K 大

public class Finder {
    public int findKth(int[] a, int n, int K) {
        return find(a, 0, n - 1, K);
    }
    private int find(int[] a, int low, int high, int K) {
        int p = partition(a, low, high);
        if ((p+1) < K) {
            return find(a, p+1, high, K);
        } else if ((p+1) > K) {
            return find(a, low, p-1, K);
        } else {
            return a[p];
        }
    }
    private int partition(int[] a, int low, int high) {
        int pValue = a[low];
        while (low < high) {
            while (low < high && a[high] <= pValue) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] >= pValue) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = pValue;
        return low;
    }
}
