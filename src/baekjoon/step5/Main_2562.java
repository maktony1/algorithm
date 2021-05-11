package baekjoon.step5;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = new int[9];
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
            if (num[i] > max) {
                max = num[i];
                cnt = i + 1;
            }
        }
        br.close();
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
