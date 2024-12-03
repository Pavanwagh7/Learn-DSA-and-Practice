//under developement
package Binary_search;

import java.util.Scanner;
import java.util.Arrays;

public class SearchElementInArrayUsingBinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner object

        int []arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 100};   //array definition

        System.out.println("enter target:");
        int target = sc.nextInt();     //input target which you want to search


        int start_index = 0;                   //started from 0
        int end_index = (arr.length-1);        //end with (arraylength - 1)
        int middle_index = (start_index + end_index)/2;     //middle index calculation


        while (start_index < end_index){       //bacause as soon as start > end loop will not run;

            if (target == arr[middle_index]){
                System.out.println("target exists in the array at the index " + middle_index);
                break;
            }
            else if (arr[middle_index] < target){         //this executes when target element is greater than the middle element
                start_index = middle_index;
                middle_index = (start_index + end_index)/2;
            }
            else{
                end_index = middle_index;                  //this executes when middle element is less than target element
                middle_index = (start_index + end_index)/2;
            }


        }

    }
}