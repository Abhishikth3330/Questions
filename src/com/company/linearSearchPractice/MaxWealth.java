package com.company.linearSearchPractice;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for (int[] account : accounts){
            int sum = 0;
            for (int person : account){
                sum = sum + person;
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
