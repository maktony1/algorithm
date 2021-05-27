package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String CroatiaAlphabet = br.readLine();
        char s;
        int cnt = 0;

        for (int i = 0; i < CroatiaAlphabet.length(); i++) {
            s = CroatiaAlphabet.charAt(i);

            if (s == 'c') {
                if (i < CroatiaAlphabet.length() - 1) {
                    if (CroatiaAlphabet.charAt(i + 1) == '=') {
                        i++;
                    }//end c=
                    else if (CroatiaAlphabet.charAt(i + 1) == '-') {
                        i++;
                    }//end c-
                }
            }//end c

            if (s == 'd') {
                if (i < CroatiaAlphabet.length() - 1) {
                    if (CroatiaAlphabet.charAt(i + 1) == 'z') {
                        if (i < CroatiaAlphabet.length() - 2) {
                            if (CroatiaAlphabet.charAt(i + 2) == '=') {
                                i = i + 2;
                            }
                        }
                    }//end dz=
                    else if (CroatiaAlphabet.charAt(i + 1) == '-') {
                        i++;
                    }//end d-
                }
            }//end d

            if (s == 'l') {
                if (i < CroatiaAlphabet.length() - 1) {
                    if (CroatiaAlphabet.charAt(i + 1) == 'j') {
                        i++;
                    }//end lj
                }
            }//end l

            if (s == 'n') {
                if (i < CroatiaAlphabet.length() - 1) {
                    if (CroatiaAlphabet.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }//end n

            if (s == 's') {
                if (i < CroatiaAlphabet.length() - 1) {
                    if (CroatiaAlphabet.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }//end s

            if (s == 'z') {
                if (i < CroatiaAlphabet.length() - 1) {
                    if (CroatiaAlphabet.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }//end z
            cnt++;
        }//end of for
        System.out.println(cnt);
    }
}