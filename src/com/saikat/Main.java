package com.saikat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //find whether a certain number present in the array
        int[] nums = {1,2,14,5,6,-11,23};
        int target = -11;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    //search in the array : return the index if item found
    //otherwise if item not found return -1

    static  int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is equal to target

            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //this line will only execute when all return doesn't execute
        return  -1;
    }
    // search the target and return the element
static  int linearSearch2(int[] arr,int target){
    if (arr.length == 0){
        return -1;
    }
    //run a for loop
    for (int element : arr) {
        // check for element at every index if it is equal to target

        if (element == target) {
            return element;
        }
    }
    //this line will only execute when all return doesn't execute
    return  Integer.MAX_VALUE;
}
// search the target and return true or false
static  boolean linearSearch3(int[] arr,int target){
    if (arr.length == 0){
        return false;
    }
    //run a for loop
    for (int element : arr) {
        // check for element at every index if it is equal to target


        if (element == target){
            return true;
        }
    }
    //this line will only execute when all return doesn't execute
    return  false;
}
}
