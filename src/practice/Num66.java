package practice;

import java.util.Arrays;
import java.util.Scanner;

class Num66 {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
//        if (digits[0] != 9) {
//
//        }
//
//        digits[l - 1] ++;
//        if (digits[l - 1] >= 10) {
//            int[] a = new int[l + 1];
//            for (int i = 0; i < l; i++) {
//                a[i] = digits[i];
//            }
//            a[l - 1] = digits[l - 1] / 10;
//            a[a.length - 1] = digits[l - 1] % 10;
//            return a;
//        }else {
//            return digits;
//        }
        for (int i = l - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[l + 1];
        temp[0] = 1;
        return temp;
    }

    public static void main(String[] args) {
        Num66 n = new Num66();
        Scanner sc = new Scanner(System.in);
        int numLength;
        numLength = sc.nextInt();
        int[] num = new int[numLength];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(n.plusOne(num)));
    }
}
