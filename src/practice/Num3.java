package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num3 {
//    public boolean isContain(String paraS, char ch, int paraBegin, int paraEnd) {
//        boolean flag = false;
//        for (int i = paraBegin; i <= paraEnd; i++) {
//
//        }
//        return flag;
//    }
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        String a = s.substring(0, 2);
        StringBuffer buf = new StringBuffer();

        for (int i = 1; i < s.length(); i++) {
            String s1 = s.substring(0, i);
            char ch = s.charAt(i);
            if (s1.indexOf(ch) == -1) {

            }
        }
    }
}
