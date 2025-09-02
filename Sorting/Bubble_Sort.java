package Sorting;

//import java.util.Scanner;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr = {32,-12,0,-36,3,2,1};

        int[] sorted_array = sort(arr);
        System.out.println(Arrays.toString(sorted_array));

    }
    static int[] sort(int[] arr){
        boolean swapped;
        //run the steps n - 1 times
        for (int i = 0;i < arr.length;i++){
            swapped = false;
            //for each step max item will come at the last respective index
            for(int j = 1;j < arr.length - i;j++){
                if(arr[j] < arr[j - 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // Break if no swaps were made (array is already sorted)
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
