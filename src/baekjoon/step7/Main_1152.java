package baekjoon.step7;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        br.close();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                if (String.valueOf(str.charAt(i)) != null) {
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}


