package day_19;

/**
 * Author: lisiyu
 * Created: 2020/3/24
 */

// 子串判断

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] booleans = new boolean[n];
        for (int i = 0; i < n; i++) {
            booleans[i] = s.contains(p[i]);
        }
        return booleans;
    }
}
