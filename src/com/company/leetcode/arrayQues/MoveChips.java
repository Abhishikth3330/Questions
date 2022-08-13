// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
// 1217 Minimum cost to move chips to the same position

package com.company.leetcode.arrayQues;

public class MoveChips {
    public int minCostToMoveChips(int[] position) {
        int even_count = 0;
        int odd_count = 0;

        for (int i : position){
            if (position[i] % 2 == 0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        return Math.min(odd_count, even_count);
    }
}
