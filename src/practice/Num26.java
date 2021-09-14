package practice;

/**
 * @author WangZY
 * @date 2021年09月14日14:15
 */
public class Num26 {
    public int removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        } else if (nums.length == 1) {
            return 1;
        } else {
            int temp = nums[0];
            int len = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == temp) {
                    continue;
                } else {
                    temp = nums[i];
                    nums[len] = nums[i];
                    len ++;
                }//of if
            }//of for i
            for (int i = 0; i < len; i++) {
                System.out.print(nums[i] + " ");
            }//of for i
            System.out.println();
            System.out.println("The length of the new array is :" + len);
            return len;}
    }

    public static void main(String[] args) {
        int[] num = {1,2,2,4,5,7,7,8};
        Num26 s = new Num26();
        s.removeDuplicates(num);
    }//of main
}
