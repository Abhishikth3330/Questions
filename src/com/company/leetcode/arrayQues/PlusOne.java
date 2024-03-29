// https://leetcode.com/problems/plus-one/0

package com.company.leetcode.arrayQues;

public class PlusOne {
    public int[] plusOne(int[] digits){
        for (int i = digits.length; i >= 0; i++) {
            if (digits[i] != 9){
                digits[i]++;
                break;
            }else{
                digits[i] = 0;
            }
        }
        if (digits[0] == 0){
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
