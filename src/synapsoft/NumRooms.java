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
        sum = 0;
        for (int ii = 0; ii < N; ii++) {
            for (int jj = 0; jj < N; ) {
                for (int i = ii; i < N; i++) {
                    for (int j = jj; j < N; j++) {
                        if (S > sum) { // sum이 작을 경우
                            sum += rooms[i][j];
                            roomCheck[i][j] = true;
                        }
                        //S와 같은경우 가로안에 한번 세로에 한번

                        if (S == sum) { // sum이 같을경우
                            //경로 출력하기 && 출력 후에 체크 초기화
                            for (int k = 0; k < N; k++) {
                                for (int l = 0; l < N; l++) {
                                    if (roomCheck[k][l] == true) {
                                        System.out.print(rooms[k][l]);
                                        roomCheck[k][l] = false;
                                    }
                                }
                            }
                        }

                        if (S < sum) { // sum이 초과한 경우 한칸 뒤로 물러난 후 아래로 turn
                            sum -= rooms[i][j];
                            roomCheck[i][j] = false;
                            j--;

                            turn = true;

                            for (int k = i + 1; k < N; k++) {
                                if (S > sum) {
                                    sum += rooms[k][j];
                                    roomCheck[k][j] = true;
                                }
                                if (S == sum) {
                                    for (int l = 0; l < N; l++) {
                                        for (int m = 0; m < N; m++) {
                                            if (roomCheck[l][m] == true) {
                                                System.out.print(rooms[l][m]);
                                                roomCheck[l][m] = false;
                                            }
                                        }
                                    }
                                    sum = 0;
                                } //end of if

                                if (S < sum) {
                                    sum -= rooms[k][j];
                                    roomCheck[k][j] = false;
                                    //초기화
                                    for (int l = 0; l < N; l++) {
                                        for (int m = 0; m < N; m++) {
                                            if (roomCheck[l][m] == true) {
                                                System.out.print(rooms[l][m]);
                                                roomCheck[l][m] = false;
                                            }
                                        }
                                    }
                                    sum = 0;
                                    break;
                                }
                            }//end of for
                            jj++;
                            break;
                        }
                    }
                }

            }
        }

    }//end of main
}//end of class
