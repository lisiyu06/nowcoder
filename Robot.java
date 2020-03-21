package day_10;

/**
 * Author: lisiyu
 * Created: 2020/3/21
 */

// 机器人走方格1

public class Robot {
    public int countWays(int x, int y) {
        if ( x==1 || y==1 ) {
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }
}
