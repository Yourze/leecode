package sfrm14days.day1_search;

/**
 * @author WangZY
 * @date 2021年12月12日12:12
 */
public class Solution {
    public int search(int[] nums, int target) {
        int flag = -1;
        int begin = 0;
        int end = nums.length - 1;

        while (begin <= end) {
            int mid = (end - begin) / 2 + begin;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {-1,0,3,5,9,12};
        int target = 12;
        int f = s.search(a, target);
        System.out.println(f);
    }
}
