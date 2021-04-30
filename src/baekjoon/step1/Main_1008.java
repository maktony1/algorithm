package baekjoon.step1;

import java.util.Scanner;

public class Main_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        System.out.println(A/B);

        sc.close();
        //double 와 float 중 고민 같은 실수형 8바이트 4바이트 차이 말고는 큰 차이를 모름
        //정밀도 차이가 난다함( 유효자리수도 정밀도에 포함 )
        //float는 7자리 double는 15~16자리까지 표현가능

    }
}
