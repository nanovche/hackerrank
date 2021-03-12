package sorting;

import java.util.Arrays;

public class MarkAndToys {

    public static void main(String[] args) {

        System.out.println(maximumToys(new int[]{1,12,5,111,200,1000,10}, 50));

    }

    static int maximumToys(int[] prices, int k) {

        int count = 0;
        Arrays.sort(prices);
        for (int currentPrice : prices) {
            if (currentPrice < k) {
                k -= currentPrice;
                count++;
            }
        }
        return count;
    }
}
