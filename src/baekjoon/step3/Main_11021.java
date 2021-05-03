package baekjoon.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Main_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        int sum;

        for (int i = 1; i <= tc; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sum = (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            bw.write("Case #"+i+": "+String.valueOf(sum));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
