package baekjoon.step5;

import java.io.*;

public class Main_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        int cnt = 10;

        for (int i = 0; i < 10; i++) {
            arr[i] = (Integer.parseInt(br.readLine()) % 42);
            System.out.println(arr[i]);
        }

        for (int i = 0; i < 10; i++) {

        }
    }
}
