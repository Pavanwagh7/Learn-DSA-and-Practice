package Sorting;
import java.util.Arrays;
public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct_index = arr[i] - 1;//finds the correct index of arr[i]
            if (arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}