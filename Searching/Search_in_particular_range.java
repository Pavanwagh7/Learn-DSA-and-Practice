package Searching;

import java.util.Scanner;

public class Search_in_particular_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//object of Scanner class

        //size of array
        System.out.println("enter the size of an array:");
        int size = sc.nextInt();

        int [] arr = new int[size];//declaration of array

        System.out.println("enter the array elements:");
        for (int i = 0;i<size;i++)//input array
            arr[i] = sc.nextInt();

        System.out.println("array elements are:");//printing array that was input.
        for (int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }


        System.out.println("enter the target:");//target element input
        int target = sc.nextInt();

        //inputting thr range
        System.out.println("in what range you want to find the target(enter range in start and end form),\nStart = ");
        int start = sc.nextInt();
        System.out.println("End = ");
        int end = sc.nextInt();

        //call function check();
        boolean ans = check(arr,target,start,end);
        //execution
        if (ans == true)
            System.out.println("the target is found in the range");
        else
            System.out.println("the target isn't found in the range");

    }
    //method/function definition of check();
    static boolean check(int arr[],int target,int start,int end){

        for(int i = start;i <= end;i++){
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }
}