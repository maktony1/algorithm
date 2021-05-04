package baekjoon.step4;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10951 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a, b;
        String str = "";

        while (  (str= br.readLine()) != null   ) {

            st = new StringTokenizer(str, " ");

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
//여기서는 이 코드가 안돌아감...몇시간 헤맸다 하...
