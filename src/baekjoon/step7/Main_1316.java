package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        String str;
        int cnt = tc;

        for (int i = 0; i < tc; i++) {
            System.out.println();
            str = br.readLine();

            //첫 단어 체크
            loop:
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) < str.length() - 2 && str.charAt(j) != str.charAt(j)) {
                    for (int k = j + 2; k < str.length() - j - 2; k++) {
                        if (str.charAt(j) == str.charAt(k)) {
                            break loop;
                        } else {
                            cnt++;
                        }
                    }
                }
            }

        }
        System.out.println("cnt = "+cnt);
    }
}


