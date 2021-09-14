package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num53 {
    public int maxSubArray(int[] nums) {
        int init = nums[0];
        int[] max = new int[nums.length];
        max[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < 0) {
                continue;
            } else {
                nums[i] += nums[i - 1];
            }
        }
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 1]);
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        Num53 n = new Num53();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] nums = new int[a];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        n.maxSubArray(nums);
    }
}
