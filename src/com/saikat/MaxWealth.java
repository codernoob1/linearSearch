package com.saikat;

public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        // person -> rol
        // account -> col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new column take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+= accounts[person][account];
            }
            //now we have sum of accounts of person
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
