package baekjoon.step3;

import java.io.*;

public class Main_2742 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 0; i < num; num--) {
            bw.write(String.valueOf(num));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
