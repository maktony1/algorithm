package synapsoft;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumRooms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\NewDeal\\algorithm\\src\\synapsoft\\num_rooms.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int sum=0;


        //배열 크기 지정
        int[][] rooms = new int[N][N];

        //배열에 삽입 시작
        for (int i = 0; i < rooms.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < rooms.length; j++) {
                rooms[i][j] = Integer.parseInt(st.nextToken());
            }
        }//여기까지 배열에 삽입 완료



        //변수가 잘 들어 갔는지 확인
        System.out.println("N은 = " + N + "\nS는 = " + S);//////////////지울부분 시작
        //테스트 배열에 잘 들어갔는지 확인
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(Arrays.toString(rooms[i]));
        }//배열에 잘 들어갔는지 확인 끝                         //////////////지울부분 끝




        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms.length; j++) {
                if (sum == S) {

                } else if (sum < S) {
                    sum = rooms[i][j] = rooms[i][j + 1];
                }
            }
        }

    }
}
