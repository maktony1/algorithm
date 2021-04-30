package baekjoon.step1;

import java.util.Scanner;

public class Main_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();

        for (int i = 1; i <= B.length(); i++) {
            System.out.println(A * (B.charAt(B.length() - i) - '0'));
            if (i == B.length()) {
                System.out.println(A * Integer.parseInt(B));
            }//end of if
        }//end of for
    }//end of main
}//end of class
