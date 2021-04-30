package baekjoon.step3;

import java.util.Scanner;

public class Main_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            System.out.println(sc.nextInt()+sc.nextInt());
        }
        sc.close();
    }
}
