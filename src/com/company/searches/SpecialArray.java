// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

package com.company.searches;

public class SpecialArray {
    public int search(int[] nums, int target){
        int left = 0; int right = nums.length - 1;
        int mid;

        while (left <= right){
            mid = left + (right - left) / 2;

            if (target == nums[mid]){
                return mid;
            }
            if (target < nums[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
