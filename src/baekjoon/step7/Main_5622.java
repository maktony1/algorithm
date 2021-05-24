package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = br.readLine().split("");
        int time = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals("A") || arrStr[i].equals("B") || arrStr[i].equals("C")) {
                time += 3;
            } else if (arrStr[i].equals("D") || arrStr[i].equals("E") || arrStr[i].equals("F")) {
                time += 4;
            } else if (arrStr[i].equals("G") || arrStr[i].equals("H") || arrStr[i].equals("I")) {
                time += 5;
            } else if (arrStr[i].equals("J") || arrStr[i].equals("K") || arrStr[i].equals("L")) {
                time += 6;
            } else if (arrStr[i].equals("M") || arrStr[i].equals("N") || arrStr[i].equals("O")) {
                time += 7;
            } else if (arrStr[i].equals("P") || arrStr[i].equals("Q") || arrStr[i].equals("R") || arrStr[i].equals("S")) {
                time += 8;
            } else if (arrStr[i].equals("T") || arrStr[i].equals("U") || arrStr[i].equals("V")) {
                time += 9;
            } else if (arrStr[i].equals("W") || arrStr[i].equals("X") || arrStr[i].equals("Y") || arrStr[i].equals("Z")) {
                time += 10;
            }
        }
        System.out.println(time);
    }
}

/**
 * equals 와 == 차이점
 * 형태의 차이
 * equals  는 메소드 임 객체끼리 내용을 비교할 수 있도록 함.  (대상 자체를 비교함)
 * ==    는 비교를 위한 연산자임  (대상의 주소값을 비교함)
 */


