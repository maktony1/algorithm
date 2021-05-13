package baekjoon.step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_15596 {
    public static void main(String[] args) {
    }
}
class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans+=a[i];
        }
        return ans;
    }
}