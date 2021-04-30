package baekjoon.step2;

import java.util.Scanner;

public class Main_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (minute >= 45) {
            System.out.println(hour+" "+(minute - 45));
        }else if (hour == 0) {
            System.out.println((hour-1+24)+" "+(minute-45+60));
        }else {
            System.out.println((hour-1)+" "+(minute-45+60));
        }
    }
}
