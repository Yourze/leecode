package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author WangZY
 * @date 2021年09月10日11:10
 */
public class Num217 {
    public boolean containsDuplicate(int[] nums) {
        boolean f = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                continue;
            } else {
                f = true;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Num217 n = new Num217();
        Scanner scanner = new Scanner(System.in);
        int numsLength = scanner.nextInt();
        int[] nums = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            nums[i] = scanner.nextInt();
        }
        if (n.containsDuplicate(nums)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
