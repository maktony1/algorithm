package baekjoon.step4;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String initValue = br.readLine();
        String a,b;
        int sum;
        System.out.println("initValue="+initValue);
//        while (true){
        st = new StringTokenizer(initValue, "");

        a = st.nextToken();
        System.out.println("a="+a);
        b = st.nextToken();
        System.out.println("b="+b);

        sum = Integer.parseInt(a + b);
        System.out.println("sum=" + sum);
//        }
    }
}
