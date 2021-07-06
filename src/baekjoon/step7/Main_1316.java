package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        String str;
        int cnt = 0;
        String[] charArray;

        for (int i = 0; i < tc; i++) {
            str = br.readLine();
            //3글자 미만은 무조건 그룹단어로 체크
            if (str.length() < 3) {
                cnt++;
                System.out.println("3개미만 카운팅 +1");
            }
            if (str.length() > 2) {
                charArray = new String[str.length()];   //문자 길이만큼 배열 생성
                charArray = str.split("");   //문자1개씩 나눠서 배열에 넣기
                System.out.println("문자길이는 " + charArray.length);

                for (int j = 0; j < charArray.length; j++) {
                    if (j < (charArray.length - 2)) {
                        if ((charArray[j].equals(charArray[j + 1])) == false && (charArray[j].equals(charArray[j + 2])) == true) {
                            System.out.println("문자 1번2번 다르고 1번3번 같을 경우");
                            break;
                        }
                    }
                    cnt++;
                }
                System.out.println("카운팅 + 1 ");
            }
            //3글자 이상부터 체크하기
        }//end of tc
        System.out.println(cnt);
    }
}



