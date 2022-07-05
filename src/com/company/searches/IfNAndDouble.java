// https://leetcode.com/problems/check-if-n-and-its-double-exist/
package com.company.searches;

public class IfNAndDouble {
    public boolean checkIfExist(int[] arr) {
        int res;
        for (int i = 0; i < arr.length; i++) {
            res = check_binarySearch(arr, arr[i]*2);
            if (res != i && res != 1){
                return true;
            }
        }
        return false;
    }

    public int check_binarySearch(int[] arr, int target) {

        int left = 0;
        int mid;
        int right = arr.length - 1;

        while (left <= right){
            mid = left + (right - left) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (target < arr[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return  -1;
    }
}
