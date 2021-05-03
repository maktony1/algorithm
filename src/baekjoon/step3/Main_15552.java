package baekjoon.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Main_15552 {
    public static void main(String[] args) throws IOException {
        //입력받는애
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력하는애
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //잘라주는 애 만듬
        StringTokenizer st;
        //우선 테스트 케이스를 받아서 몇번 반복시킬건지 정함
        int tc = Integer.parseInt(br.readLine());

        //테스트 케이스 수만큼 돌게함
        for (int i = 0; i < tc; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String sum = String.valueOf((a + b));
            bw.write(sum);
            bw.newLine();
        }
        bw.flush(); //for문안에 한번씩 출력하는게 아니라 bw 에 기록하고 모아뒀다가 한번에 출력해버리기!!
        bw.close();
        br.close();
    }
}
