//https://leetcode.com/problems/single-element-in-a-sorted-array/

package com.company.searches;

public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;

        while(start <= end){
            mid = start + (end - start) / 2;

            int num = mid + 1;

            if (num % 2 == 0){
                // even number of elements from 0 to mid
                if (mid > 0 && nums[mid] == nums[mid - 1]){
                    start = mid + 1;
                }else if(mid < nums.length - 1 && nums[mid] == nums[mid + 1]){
                    end = mid - 1;
                }else{
                    return nums[mid];
                }
            }
            else{
                if (mid > 0 && nums[mid] == nums[mid - 1]){
                    end = mid - 1;
                }else if(mid < nums.length - 1 && nums[mid] == nums[mid + 1]){
                    start = mid + 1;
                }else{
                    return nums[mid];
                }
            }
        }
        return nums[mid];
    }
}
