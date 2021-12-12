package sfrm14days.day1_searchinsert;

/**
 * @author WangZY
 * @date 2021年12月12日13:28
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int flag = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (flag == -1) {
            if (target > nums[left]) {
                flag = left + 1;
            } else {
                flag = left;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1};
        int target = 0;
        int a = s.searchInsert(nums,target);
        System.out.println(a);
    }
}
