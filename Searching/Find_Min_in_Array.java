package Searching;

import java.util.Scanner;
import java.util.Arrays;

public class Find_Min_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of array
        System.out.println("enter the size of an array:");
        int size = sc.nextInt();

        int [] arr = new int[size];//declaration of array

        System.out.println("enter the array elements:");
        for (int i = 0;i<size;i++)//input array
            arr[i] = sc.nextInt();

        //best way to print array as a String.
        System.out.println(Arrays.toString(arr));

//        System.out.println("array elements are:");//printing array that was input.
//        for (int i = 0;i<size;i++){
//            System.out.println(arr[i]);
//        }

        //call the function
        int Min_number = minimum(arr);
        System.out.println("the minimum number among all array elements is "+ Min_number);
    }
    static int minimum(int arr[] ){
        int min = arr[0];
        for(int i = 1;i< arr.length;i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}