package baekjoon.step5;

import java.io.*;
import java.util.Arrays;

/**
Integer.toString 사용 배열 뒤에 값이 0이면
checkAnswer.length() 할 경우 뒤에 숫자가
 0이면 인식안하는듯 10칸인데 8번만 for문을돔
 */
public class Main_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 1;
        int[] check = new int[10];
        int[] checkAnswer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        //입력값 곱하기
        for (int i = 0; i < 3; i++) {
            answer *= Integer.parseInt(br.readLine());
        }//end of for
        br.close();
        //입력값 String형으로 변환
        String strAnswer = Integer.toString(answer);

        //배열에 각각 삽입
        for (int i = 0; i < strAnswer.length(); i++) {
            check[i] = strAnswer.charAt(i) - '0';
            checkAnswer[check[i]]++;
        }//end of for

        //답 출력
        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(checkAnswer[i]));
            bw.newLine();
        }//end of for
        bw.flush();
        bw.close();
    }
}
