package Binary_search;

import java.util.Scanner;
import java.util.Arrays;

public class Search_Using_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //the very first condition to use binary search is array provided must be sorted i.e elements
        //are arranged in ascending order or descending order

        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 100}; //declared sorted array
        System.out.println(Arrays.toString(arr));//print array just for clarifiacation

        System.out.println("enter the target element: ");
        int target = sc.nextInt();//input target element

        int result = f1(arr,target);//function call
        if (result == -1)
            System.out.println("target element doesn't exist in the array");
        else
            System.out.println("target element exits in the array at the index "+ result);

    }
    static int f1(int[] arr,int target){

        int start_index = 0;                                 //start index
        int end_index = (arr.length - 1);                    //end index
        int middle_index = (start_index + end_index) / 2;    //middle index

        while (start_index <= end_index){       //bacause as soon as start > end loop will not run;

            if (target == arr[middle_index]){       //this will check meiddle element is target or not
                return middle_index;
            }
            else if (arr[middle_index] < target){         //this executes when target element is greater than the middle element
                start_index = middle_index + 1;
                middle_index = (start_index + end_index)/2;
            }
            else{
                end_index = middle_index - 1;                  //this executes when middle element is less than target element
                middle_index = (start_index + end_index)/2;
            }
        }
        return -1; // this will only be executed when target does not found in the array
    }
}