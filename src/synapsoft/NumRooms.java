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
        int sum;
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


//        //변수가 잘 들어 갔는지 확인
//        System.out.println("N은 = " + N + "\nS는 = " + S);//////////////지울부분 시작
//        //테스트 배열에 잘 들어갔는지 확인
//        for (int i = 0; i < rooms.length; i++) {
//            System.out.println(Arrays.toString(rooms[i]));
//        }//배열에 잘 들어갔는지 확인 끝                         //////////////지울부분 끝
//        for (int i = 0; i < rooms.length; i++) {
//            System.out.println(Arrays.toString(roomCheck[i]));
//        }

        sum = 0;
        //가로 체크
        loop:
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms.length; j++) {
                if (sum < S) {
                    for (int k = j; k < rooms.length; k++) {
                        sum += rooms[i][k];
                        roomCheck[i][k] = true;
                        if (sum > S) {
                            sum -= rooms[i][k];
                            roomCheck[i][k] = false;
                            k--;
                            break;
                        }
                    }
                    for (int k2 = i; k2 < rooms.length; k2++) {
                        sum += rooms[i][k2];
                        roomCheck[i][k2] = true;
                        if (sum == S) {

                        }
                    }
                }
                if (sum == S) {
                    for (int l = 0; l < rooms.length; l++) {
                        for (int m = 0; m < rooms.length; m++) {
                            if (roomCheck[l][m] == true) {
                                System.out.println(rooms[l][m]);
                            }
                        }
                    }
                }
                if (sum > S) { //더한 수가 초과 하면
                    sum -= rooms[i][j];
                    roomCheck[i][j] = false;
                    j--;

                    turn = true; //방향 전환 체크
                    //전환 후 아래방향 체크
                    for (int k = i + 1; k < rooms.length; k++) {
                        sum += rooms[k][j];
                        roomCheck[k][j] = true;
                        if (sum == S) {
                            for (int l2 = 0; l2 < rooms.length; l2++) {
                                for (int m2 = 0; m2 < rooms.length; m2++) {
                                    if (roomCheck[l2][m2] == true) {
                                        System.out.println(rooms[l2][m2]);
                                    }
                                }
                            }
                            break loop;
                        }
                        if (sum > S) {
                            sum -= rooms[k][j];
                            roomCheck[k][j] = false;

                        }
                    }
                }
            }//end of for(j)
        }//end of for(i)


    }//end of main
}//end of class
