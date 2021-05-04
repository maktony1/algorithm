package baekjoon.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //여기서 한줄을 받아서 짤라줌 공백으로
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //짜르면2개가 나옴 한개씩 넣어주고
        int A = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int num;
        //다시 한줄을 새로 받아야함 그래서 한개씩 짤라서 넘버에 넣어주면됨
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            num = Integer.parseInt(st.nextToken());
            if (X > num) {
                bw.write(num + " ");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
