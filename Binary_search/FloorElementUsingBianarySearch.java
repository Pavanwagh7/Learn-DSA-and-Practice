package Binary_search;

import java.util.Scanner;
import java.util.Arrays;

public class FloorElementUsingBianarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{2,6,8,14,16,18,20}; //declared sorted array
        System.out.println(Arrays.toString(arr));//printing array just for clarifiacation

        System.out.println("enter the target element: ");
        int target = sc.nextInt();//input target element

        int result = f3(arr,target);//function call
        System.out.println("floor of the target element is "+ arr[result]);
    }
    static int f3(int[] arr, int target){

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
        return end_index; // this will only be executed when target does not found in the array
    }
}