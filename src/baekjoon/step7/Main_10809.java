package baekjoon.step7;

import java.io.*;
import java.util.Arrays;

public class Main_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        br.close();

        int[] alphCheck = new int[26];
        for (int i = 0; i < alphCheck.length; i++) {
            alphCheck[i] = -1;
        }
        for (int i = 'a'; i < 'a' + alphCheck.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == s.charAt(j) && alphCheck[i - 'a'] == -1) {
                    alphCheck[i - 'a'] = j;
                }
            }
        }
        for (int i = 0; i < alphCheck.length; i++) {
            bw.write(alphCheck[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}


