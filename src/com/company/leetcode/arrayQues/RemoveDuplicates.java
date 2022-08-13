// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package com.company.leetcode.arrayQues;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int previous = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[previous]){
                previous++;
                nums[previous] = nums[i];
            }
        }
        return previous + 1;
    }
}
