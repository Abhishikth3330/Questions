// https://leetcode.com/problems/fair-candy-swap/
package com.company.searches;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;

        for (int x: aliceSizes){
            sum1 += x;
        }
        for (int x: bobSizes){
            sum2 += x;
        }

        int x = (sum1 - sum2) / 2;

        for (int i = aliceSizes.length - 1; i >= 0; i--) {
            for (int j = bobSizes.length - 1; j >= 0; j--) {
                if (aliceSizes[i] - bobSizes[j] == x){
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
