package baekjoon.step5;

import java.io.*;
import java.util.HashSet;

public class Main_3052 {
    /**
     * HashSet을 사용하여 중복 제거 하는 방법
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();
        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
    }
    //        System.out.println(set.size());
    //        System.out.println(set);
    //        Iterator iter = set.iterator();
    //
    //        for (int i = 0; i < 10; i++) {
    //            iter.hasNext();
    //            System.out.println(iter.next());
    //        }
    //    }
    /**
     * 그냥 일반 배열을 사용해서 중복 체크
     * */
    //    public static void main(String[] args) throws IOException {
    //        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //
    //        boolean[] arr = new boolean[42];
    //
    //        for (int i = 0; i < 10; i++) {
    //            arr[(Integer.parseInt(br.readLine()) % 42)] = true;
    //        }
    //        br.close();
    //
    //
    //        int cnt = 0;
    //        for (int i = 0; i < arr.length; i++) {
    //            if (arr[i] == true) {
    //                cnt++;
    //            }
    //        }
    //        bw.write(String.valueOf(cnt));
    //        bw.flush();
    //        bw.close();
    //    }

}

