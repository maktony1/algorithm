package baekjoon.step6;


import java.io.*;

public class Main_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(hansu(Integer.parseInt(br.readLine()))));
        br.close();
        bw.flush();
        bw.close();
    }
    public static int hansu(int num) {
        int cnt = 0;

        if (num < 100) {
            return num;
        }

        else {
            cnt = 99;
            if (num == 1000) {
                num = 999;
            }

            for (int i = 100; i <= num; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

}


