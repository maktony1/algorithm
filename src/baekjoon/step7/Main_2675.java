package baekjoon.step7;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());

        int repeat;
        String[] arrStr;
        String str;

        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            repeat = Integer.parseInt(st.nextToken()); //5
            str = st.nextToken(); // /HTP
            arrStr = new String[str.length()]; // 4칸짜리

            for (int j = 0; j < arrStr.length; j++) {
                arrStr[j] = String.valueOf(str.charAt(j));
            }
            for (int j = 0; j < arrStr.length; j++) {
                for (int k = 0; k < repeat; k++) {
                    bw.write(arrStr[j]);
                }
            }
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}


