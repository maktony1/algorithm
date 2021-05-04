package baekjoon.step4;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10952 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a,b;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");

            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0){
                break;
            }
//            bw.write(String.valueOf(a+b)+"\n"); 이거보다는 bw.newLine(); 이 빠르다 조금 더( 하지만 메모리는 조금더 적게듬)
//                        "\n" 쓰면   14436kb 에	140ms
//               bw.newLine(); 쓰면   14612kb 에 132ms

            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
