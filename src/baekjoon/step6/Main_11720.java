package baekjoon.step6;

import java.io.*;

public class Main_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum =0;

        for (int i = 0; i < cnt; i++) {
            sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
    }
}


