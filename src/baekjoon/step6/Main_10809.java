package baekjoon.step6;

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
//        a=97 b=98
        for (int i = 0; i < alphCheck.length; i++) {
            if (i+'a' == s.charAt(i)) {
                System.out.println(11111111);
            }
        }
        System.out.println(Arrays.toString(alphCheck));
        bw.write(Arrays.toString(alphCheck));


    }
}


