package practice;

import java.util.Arrays;

/**
 * @author WangZY
 * @date 2021年09月14日14:11
 */
public class Test {
    public int[] getMutationSet(int[] paraSet1,int[] paraSet2) {
        int[] tempNewSet = new int[paraSet1.length + paraSet2.length];
        System.arraycopy(paraSet1,0,tempNewSet,0,paraSet1.length);
        System.arraycopy(paraSet2,0,tempNewSet,paraSet1.length,paraSet2.length);
        Arrays.sort(tempNewSet);

        int temp = tempNewSet[0];
        int len = 1;
        for (int i = 1; i < tempNewSet.length; i++) {
            if (tempNewSet[i] == temp) {
                continue;
            } else {
                temp = tempNewSet[i];
                tempNewSet[len] = tempNewSet[i];
                len++;
            }
        }
        return Arrays.copyOfRange(tempNewSet,0,len);
    }//of getMutationSet

    public static void main(String[] args) {
        Test t = new Test();
        int[] a= {1,4,5,3,2,5,6,3,4,6,9};
        int[] b= {2,4,7,9,2,3,6,9,0,32,1};
        int[] c = t.getMutationSet(a,b);
        System.out.println(Arrays.toString(c));
    }
}
