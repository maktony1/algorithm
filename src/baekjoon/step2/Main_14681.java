package baekjoon.step2;

import java.util.Scanner;

public class Main_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // x가 양수일때
        if (x > 0) {
            // X양수 y양수
            if (y > 0) {
                System.out.println("1");
            } else { // X양수 y음수
                System.out.println("4");
            }
        }//

        // x가 음수일때
        if (x < 0) {
            // X음수 y양수
            if (y > 0) {
                System.out.println("2");
            } else { // X음수 y음수
                System.out.println("3");
            }
        }
    }
}
