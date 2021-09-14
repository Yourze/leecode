package practice;

import java.util.Arrays;
import java.util.Scanner;

class Num1 {
    public int[] twoSum(int[] nums, int target) {
//        int[] index = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int sum = nums[i] + nums[j];
//                if (sum == target) {
//                    index[0] = i;
//                    index[1] = j;
//                    break;
//                }
//            }
//        }
//        return index;
        int[] nums2 = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int a = 0;
        int b = nums.length - 1;
        while (nums[a] + nums[b] != target) {
            if (nums[a] + nums[b] > target) {
                b--;
            }else if (nums[a] + nums[b] < target) {
                a++;
            }
        }
        int r1 = 0;
        int r2 = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == nums[a]) {
                r1 = i;
                break;
            }
        }
        for (int i = nums2.length - 1; i >= 0; i--) {
            if (nums2[i] == nums[b]) {
                r2 = i;
                break;
            }
        }
        return new int[] {r1,r2};
    }

    public static void main(String[] args) {
        Num1 n = new Num1();
        Scanner sc = new Scanner(System.in);
        int numLength;
        numLength = sc.nextInt();
        int[] num = new int[numLength];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(Arrays.toString(n.twoSum(num, target)));
    }
}
