package day_26;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Author: lisiyu
 * Created: 2020/5/13
 */

// 计票统计
public class Main2 {
    public static void main(String[] args) {
        //控制台输入数据
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            //候选人人数
            int n = in.nextInt();
            String[] s = new String[n];
            //记录候选人
            HashMap<String,Integer> hs = new HashMap<String,Integer>();
            for(int i=0;i<n;i++){
                String temp = in.next();
                hs.put(temp,0);
                s[i] = temp;
            }
            //投票人数
            int m = in.nextInt();
            Set<String> keys = hs.keySet();
            int cnt =  0;
            for(int i = 0; i<m; i++) {
                //投票
                String tick = in.next();
                if(keys.contains(tick)) {
                    hs.put(tick, hs.get(tick)+1);
                } else {
                    cnt++;
                }
            }
            //输出结果
            for(String k:s) {
                System.out.println(k+" : "+hs.get(k));
            }
            System.out.println("Invalid : "+cnt);
        }
        in.close();
    }
}
