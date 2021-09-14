package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author WangZY
 * @date 2021年09月13日16:55
 */
public class Num350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return intersect(nums2,nums1);
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num,0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num: nums2) {
            int count = map.getOrDefault(num,0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num,count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection,0,index);
    }

    public static void main(String[] args) {
        Num350 s = new Num350();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] nums1 = new int[m];

        int n = scanner.nextInt();
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(s.intersect(nums1,nums2)));
    }
}
