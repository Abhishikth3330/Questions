package com.company.searches;

public class BinarySearchQues {
    public int search(int[] nums, int target) {
        int left = 0;
        int mid;
        int right = nums.length - 1;

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
        return  -1;
    }
}
