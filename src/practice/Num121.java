package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author WangZY
 * @date 2021年09月14日14:36
 */
public class Num121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > profit){
                profit = prices[i] - minPrice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Num121 s = new Num121();
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();
        int[] a = new int[aa];
        for (int i = 0; i < aa; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(s.maxProfit(a));
    }
}
