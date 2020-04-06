package day_15;

/**
 * Author: lisiyu
 * Created: 2020/4/6
 */

// 另类加法
public class UnusualAdd {
    public int addAB(int A, int B) {
        if(B==0)
            return A;
        int sum = A ^ B;  //相加但不进位
        int jin = (A & B) << 1;  //进位但不相加
        return addAB(sum, jin);
    }
}
