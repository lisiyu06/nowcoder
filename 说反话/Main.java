package day_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: lisiyu
 * Created: 2020/5/22
 */

// 说反话
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] words = line.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            System.out.format("%s ", words[words.length - 1 - i]);
        }
        System.out.println(words[0]);
    }
}
