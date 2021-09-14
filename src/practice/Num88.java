package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while ((p1 >= 0) && (p2 >= 0)) {
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
        }
        System.arraycopy(nums2,0,nums1,0,p2+1);
    }

    public static void main(String[] args) {
        Num88 num88 = new Num88();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] num1 = new int[m + n];
        int[] num2 = new int[n];
        for (int i = 0; i < m; i++) {
            num1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num2[i] = scanner.nextInt();
        }
        num88.merge(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));
    }
}
