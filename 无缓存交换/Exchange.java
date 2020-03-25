package day_12;

/**
 * Author: lisiyu
 * Created: 2020/3/25
 */

// 无缓存交换

public class Exchange {
    public int[] exchangeAB(int[] AB) {
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }
}
