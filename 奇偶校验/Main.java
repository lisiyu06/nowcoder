package day_30;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/5/20
 */
// 奇偶校验
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            jiQiaoYan(str.toCharArray());//将输入的字符串统一转换为字符数组
        }
    }
    public static void jiQiaoYan(char[] s) {
        int[] result = new int[8];
        for(int i = 0; i < s.length; i++) {
            int n = 0x01;
            int j = 7;
            int sum = 0;
            while(j > 0) { //需要进行7次与运算，得出1的个数 及 二进制形式
                result[j] = (s[i] & n) == 0 ? 0 : 1;    //与运算
                if(result[j] == 1) sum++;    //个数
                n = n << 1;
                j--;
            }
            if((sum & 1) == 0) result[0] = 1;    //进行校验
            for(int k = 0; k < result.length; k++){
                System.out.print(result[k]);
            }
            result[0] = 0;
            System.out.println();
        }
    }
}
