package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Sqrt_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of array
        System.out.println("enter the size of an array:");
        int size = sc.nextInt();

        double [] arr = new double[size];//declaration of array

        System.out.println("enter the array elements:");
        for (int i = 0;i<size;i++)//input array
            arr[i] = sc.nextInt();

        System.out.println(Arrays.toString(arr));

        double[] sqrt = f1(arr);
        System.out.println("Square roots of above array elements are:-\n"+Arrays.toString(sqrt));

    }
    static double[] f1(double[] arr){

        for (int i = 0 ;i < arr.length;i++){
            arr[i] = Math.sqrt(arr[i]);
        }

        return arr;
    }
}