package baekjoon.step4;

import java.io.*;

public class Main_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int initValue = Integer.parseInt(br.readLine());
        br.close();

        int num = 0;
        int sum = initValue;
        int count = 0;
        if (initValue == 0) {
            bw.write("1");
        } else {

            while (initValue != num) {
                sum = (sum % 10 * 10) + (sum / 10 + sum % 10) % 10;
                num = sum;
                count++;
                if (initValue == num) {
                    break;
                }
            }

            bw.write(String.valueOf(count));
        }
            bw.flush();
            bw.close();
    }
}
