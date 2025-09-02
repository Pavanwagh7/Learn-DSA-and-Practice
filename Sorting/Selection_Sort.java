package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {

        int[] arr = {32,-12,0,-36,3,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        for (int i = 0;i < arr.length;i++){
            //find the maximum element in the array and swap it with correct indexed element
            int last_index = arr.length - i - 1;
            int max_index = get_max_index(arr,0,last_index);
            swap(arr,max_index,last_index);
        }

    }
    static int get_max_index(int[] arr,int start_index,int end_index){
        int max_index = start_index;
        for (int i = start_index ; i <= end_index ; i++ ){
            if(arr[max_index] < arr[i])
                max_index = i;
        }
        return max_index;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}