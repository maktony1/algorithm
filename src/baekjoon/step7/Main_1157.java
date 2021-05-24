package baekjoon.step7;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;

public class Main_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase(Locale.ROOT);
        //배열에 문자 한글자씩 저장하기
        int[] arrCnt = new int[26];

        //문자 한글자씩 체크후 배열에 체크해줌
        for (int i = 0; i < str.length(); i++) {
            arrCnt[str.charAt(i) - 'A']++;
        }
        int max = 0;
        int maxIndex = 0;
        //배열 체크한 값 비교하기
        for (int i = 0; i < arrCnt.length; i++) {
            if (max < arrCnt[i]) {
                max = arrCnt[i];
                maxIndex = i;
            }
        }
        int check = 0;
        for (int i = 0; i < arrCnt.length; i++) {
            if (max == arrCnt[i]) {
                check++;
            }
        }
        if (check == 1) {
            System.out.println((char) (maxIndex + 'A'));
        } else {
            System.out.println("?");
        }
    }
}


