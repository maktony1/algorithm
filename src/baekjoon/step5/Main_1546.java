package baekjoon.step5;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tc = Integer.parseInt(st.nextToken());
        double[] arr = new double[tc];

        //다음줄 받아오기
        st = new StringTokenizer(br.readLine());
        //받아서 배열에 삽입
        for (int i = 0; i < tc; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        double max = 0;
        //비교 하기
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + (arr[i] / max * 100));
        }
        bw.write(String.valueOf(sum/arr.length));
        bw.flush();
        bw.close();

    }
}
