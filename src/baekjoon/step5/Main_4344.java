package baekjoon.step5;

import java.io.*;
import java.util.StringTokenizer;

public class Main_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());
        int[] arr;
        double sum = 0;

        //배열 생성 및 테스트 케이스 받아오기
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            arr = new int[Integer.parseInt(st.nextToken())];

            //배열에 테스트 케이스 삽입
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }//배열에 tc 삽입 완료

            //sum에 평균값을 넣음
            sum = sum / arr.length;
//            System.out.println("28번째줄 sum = " + sum);

            //평균보다 점수가 높은 학생을 체크 하기 위한 변수선언
            double cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                //평균보다 높은 점수를 받은 학생을 선별해서 카운트

                if (arr[j] > sum) {
                    cnt++;
                }
            }
            double result = cnt / arr.length * 100;
//            System.out.printf("%.3f", result);
//            System.out.println("%");
            sum = 0;
            bw.write(String.format("%.3f",result));
            bw.write("%");
            bw.newLine();
        }//end of for
        br.close();
        bw.flush();
        bw.close();
    }
}
