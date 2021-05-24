package baekjoon.step7;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        String firstNum = st.nextToken();
        String secondNum = st.nextToken();
        firstNum = String.valueOf(firstNum.charAt(2)) + firstNum.charAt(1) + firstNum.charAt(0);
        secondNum = String.valueOf(secondNum.charAt(2)) + secondNum.charAt(1) + secondNum.charAt(0);

        if (Integer.parseInt(firstNum) > Integer.parseInt(secondNum)) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }
    }
}


