package baekjoon.step6;

import java.io.*;

public class Main_11654 {
    public static void main(String[] args) throws IOException {
        //Scanner 사용
//        Scanner sc = new Scanner(System.in);
//        int str = sc.next().charAt(0);
//        System.out.println(str);

        //Buffered 사용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int str = br.readLine().charAt(0);
        br.close();
        bw.write(String.valueOf(str));
        bw.flush();
        bw.close();
    }

}


