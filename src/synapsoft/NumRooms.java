package synapsoft;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumRooms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\NewDeal\\algorithm\\src\\synapsoft\\num_rooms.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

        sum = 0;
        for (int repeat = 0; repeat < N; repeat++) {
            for (int i = 0; i < N; i++) {
                for (int j = repeat; j < N; j++) {
                    ///////////////////////////////////////////////////////
                    ///////////////////////////////////////////////////////

                    if (S > sum) {
                        sum += rooms[i][j];
                        roomCheck[i][j] = true;
                    }

                    /////////////////////////////////////////////////////
                    ///////////////////////////////////////////////////////
                    if (S == sum) {
                        for (int k = 0; k < N; k++) {
                            for (int l = 0; l < N; l++) {
                                if (roomCheck[k][j] == true) {
                                    System.out.print(rooms[k][l] + " ");
                                }
                            }
                            System.out.println();
                        }
                        //값을 다 출력 해줬으면 불린 배열 초기화
                        for (int k = 0; k < N; k++) {
                            for (int l = 0; l < N; l++) {
                                roomCheck[k][j] = false;
                            }
                        }
                        sum = 0;
                        break;
                    }

                    ///////////////////////////////////////////////////////
                    ///////////////////////////////////////////////////////

                    if (S < sum) {
                        sum -= rooms[i][j];
                        roomCheck[i][j] = false;
                        for (int k = i + 1; k < N; k++) {
                            ///////////
                            if (S > sum) {
                                sum += rooms[k][j - 1];
                                roomCheck[k][j - 1] = true;
                            }
                            ////////////
                            if (S == sum) {
                                for (int l = 0; l < N; l++) {
                                    for (int m = 0; m < N; m++) {
                                        if (roomCheck[l][m] == true) {
                                            System.out.print(rooms[l][m] + " ");
                                        }
                                    }
                                    System.out.println();
                                }
                                //값을 다 출력 해줬으면 불린 배열 초기화
                                for (int l = 0; l < N; l++) {
                                    for (int m = 0; m < N; m++) {
                                        roomCheck[l][m] = false;
                                    }
                                }
                                sum = 0;
                                break;
                            }//end of if
                            //////////////
                            if (S < sum) {
                                sum -= rooms[k][j - 1];
                                roomCheck[k][j - 1] = false;
                                for (int l = 0; l < N; l++) {
                                    for (int m = 0; m < N; m++) {
                                        roomCheck[l][m] = false;
                                    }
                                }
                                sum = 0;
                                break;
                            }
                        }
                    }
                    ///////////////////////////////////////////////////////
                    ///////////////////////////////////////////////////////
                }
            }
        }
    }//end of main
}//end of class
