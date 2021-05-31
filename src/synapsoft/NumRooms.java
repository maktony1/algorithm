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
        int sum = 0;
        boolean turn = false;

        //배열 크기 지정
        int[][] rooms = new int[N][N];

        //경로 체크할 배열
        boolean[][] roomCheck = new boolean[N][N];

        //배열에 삽입 시작
        for (int i = 0; i < rooms.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < rooms.length; j++) {
                rooms[i][j] = Integer.parseInt(st.nextToken());
            }
        }//여기까지 배열에 삽입 완료
/////////////////////////////////////////////이 위에는 크게 건드릴 필요 없음///////////////////////////////////////////


        //변수가 잘 들어 갔는지 확인
        System.out.println("N은 = " + N + "\nS는 = " + S);//////////////지울부분 시작
        //테스트 배열에 잘 들어갔는지 확인
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(Arrays.toString(rooms[i]));
        }//배열에 잘 들어갔는지 확인 끝                         //////////////지울부분 끝
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(Arrays.toString(roomCheck[i]));
        }


        //가로 체크
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms.length; j++) {

                if (j < rooms.length - 1) {
                    sum += rooms[i][j];
                    roomCheck[i][j] = true;

                    if (sum == S) {
                        for (int k = 0; k < roomCheck.length; k++) {
                            for (int l = 0; l < roomCheck.length; l++) {
                                if (roomCheck[k][l] == true) {
                                    System.out.println(rooms[k][l]);
                                }
                            }
                        }
                    }


                }

            }//end of for(j)
        }//end of for(i)


    }//end of main
}//end of class
