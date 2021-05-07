package baekjoon.step5;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[num];
        int min = 1000000;
        int max = 1;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(min+" ");
        System.out.println(max);
    }
}
