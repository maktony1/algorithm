package baekjoon.step5;

import java.io.*;
import java.util.Arrays;

public class Main_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        String[] arr;
        int sum;
        int score;

        //테스트케이스 반복
        for (int i = 0; i < tc; i++) {
            //OX 받아와서 배열 생성
            arr = br.readLine().split("");
            sum = 0;
            score = 1;
            //배열 OX 체크 부분
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("O")) {
                    sum += score++;
                }
                if (arr[j].equals("X")) {
                    score = 1;
                }
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

//