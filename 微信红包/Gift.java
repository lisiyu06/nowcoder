package day_20;

import java.util.Arrays;

/**
 * Author: lisiyu
 * Created: 2020/4/22
 */

// 微信红包
public class Gift {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);//数组排序，采用Arrays的sort方法
        int ans = gifts[n/2];//理论上超过半数的数字
        int num = 0;
        //遍历数组，进行统计
        for(int i = 0; i < gifts.length; i++) {
            if(gifts[i] == ans) {
                num++;
            }
        }
        return num <= n/2 ? 0 : ans;
    }
}
