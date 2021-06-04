package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        String str;
        int cnt = 0;

        for (int i = 0; i < tc; i++) {
            System.out.println();
            str = br.readLine();
            //3글자 미만은 무조건 그룹단어로 체크
            if (str.length() < 3) {
                cnt++;
            }

            //3글자 이상부터 체크하기



        }//end of tc
        System.out.println("cnt = " + cnt);
    }
}



