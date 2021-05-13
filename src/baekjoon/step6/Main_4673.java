package baekjoon.step6;


import java.io.*;

public class Main_4673 {
    public static void main(String[] args) throws IOException {
/**
 * 배열을 10000개 생성하고
 * d();로 1부터 10000까지 돌려서 만들 수 있는 셀프넘버를 체크함
 * boolean으로 배열을 만들면 디폴트가 false인데 true로 체크해줌 해당 배열을
 */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] check = new boolean[10001];

        for (int i = 1; i <= check.length; ++i) {
            int noSelfNum = d(i);
            if (noSelfNum <= 10000) {
                check[noSelfNum] = true;
            }
        }
        for (int i = 1; i < check.length; ++i) {
            if (check[i] == false) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();

    }

    public static int d(int n) {
        int notSelfNum = n;
        while (n > 0) {
            notSelfNum += n % 10;
            n /= 10;
        }
        return notSelfNum;
    }
}


