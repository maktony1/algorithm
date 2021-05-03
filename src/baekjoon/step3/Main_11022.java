package baekjoon.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Main_11022 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());
        int a,b;

        for (int i = 1; i <= tc; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #"+i+": "+a+" + "+b+" = "+ (a+b)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
