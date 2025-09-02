package Sorting;

import java.util.Arrays;
//use this method only when elements in the array are in continuos order with no missing elements
//eg.., arr1 = {1,5,6,4,3,2,7,8,9}
//this method will not work on arrays like arr2 = {1,4,3,7,9,8} where some elements are missing in 1 to N

// meaning that this solution won't work for array having non consecutive elements
public class Inefficient_Sort {
    public static void main(String[] args) {
        int[] brr = {1,6,7,8,2,3,4,5,9,10};// array is from 1 to N where N is greater than 1
        sorting(brr);
        System.out.println("after sorting brr = " + Arrays.toString(brr));

        int[] arr = {10,14,11,12,13,15,17,19,20,16,18};
        //find minimun element then sort
        int min = min_element(arr);
        int max = max_element(arr);
        sorting(arr,max,min);
        System.out.println("after sorting arr = " + Arrays.toString(arr));
    }
    // this sorting is usefull when array elements are given from 1 to N where N is greater than 1
    static void sorting(int[] arr){
        for (int i = 0;i < arr.length;i++)
            arr[i] = i + 1;
    }
    static int min_element(int[] arr){
        int min = arr[0];
        int max = Integer.MIN_VALUE;
        for (int j = 1;j < arr.length;j++) {
            if(min > arr[j])
                min = arr[j];
        }
        return min;
    }
    static int max_element(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j = 1;j < arr.length;j++) {
            if(max < arr[j])
                max = arr[j];
        }
        return max;
    }
    // this is useful when array given is from M to N where M < N
    static void sorting(int[] arr,int max_element,int min_element){
        int i = 0;
        while(min_element <= max_element ){
            arr[i] = min_element;
            i++;
            min_element++;
        }
    }
}