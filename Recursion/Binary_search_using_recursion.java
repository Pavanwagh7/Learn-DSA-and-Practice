package Recursion;

import java.util.Scanner;

public class Binary_search_using_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{1,2,3,4,5,6,67,97,98};
        System.out.print("enter the element you wanna find : ");
        int target = sc.nextInt();
        System.out.println();//next line

        System.out.println(search(arr,target,0,arr.length - 1));
    }
    //search function or method
    static int search(int[] arr, int target, int start, int end){
        //element does not found
        if (start > end)
            return -1;

        //calculate middle for every function call
        int middle = start + (end - start)/2;

        //check if middle elemnet is equal to target,if yes ,return middle index
        if (arr[middle] == target)
            return middle;

        // if target is greater than element at middle index,then start = middle + 1
        if (arr[middle] < target)
            return search(arr,target,middle + 1,end);

        //if target is less tham element at middle index,then end = middle - 1
        return search(arr,target,start,middle - 1);
    }
}
