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

            //첫 단어 체크
            loop:
            for (int j = 0; j < str.length(); j++) {

                //3글자 미만 일 경우
                if (3 > str.length()) {
                    cnt++;
                    break loop;
                }//3글자 미만 일 경우 끝

                //3글자 이상 일 경우
                if (3 <= str.length()) {
                    if (j < str.length() - 2) {
                        for (int k = j; k < str.length() - 2; k++) {
                            if (str.charAt(k) != str.charAt(k + 1) && str.charAt(k) == str.charAt(k + 2)) {
                                break loop;
                            }
                        }
                    }
                }
            }
            cnt++;
        }//end of tc
        System.out.println("cnt = " + cnt);
    }
}



