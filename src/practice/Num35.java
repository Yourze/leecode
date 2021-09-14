package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Num35 {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        List list = new ArrayList<>();
        list = Arrays.asList(nums);
        if (list.contains(target)) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    index = i;
                }
            }
        } else {
            if (target <= nums[0]) {
                index = 0;
            } else if (target > nums[nums.length - 1]) {
                index = nums.length;
            } else {
                for (int i = 0; i < nums.length - 1; i++) {
                    if (target > nums[i] && target <= nums[i + 1]) {
                        index = i + 1;
                    }
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Num35 n = new Num35();
        Scanner sc = new Scanner(System.in);
        int numLength;
        numLength = sc.nextInt();
        int[] num = new int[numLength];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(n.searchInsert(num, target));
    }
}
