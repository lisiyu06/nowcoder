package day_13;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2020/3/28
 */

// 超长正整数相加

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()) {
            String s1=input.next();
            String s2=input.next();
            BigInteger num1=new BigInteger(s1); //采用BigInteger可以直接进行大整数 进行计算
            BigInteger num2=new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}
