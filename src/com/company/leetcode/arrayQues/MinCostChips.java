package com.company.leetcode.arrayQues;
// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class MinCostChips {
    public static void main(String[] args) {

    }

    public int minCostToMoveChips(int[] position){
        int even_count = 0;
        int odd_count = 0;

        for(int i : position){
            if (i % 2 == 0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        return Math.min(even_count, odd_count);
    }
}
