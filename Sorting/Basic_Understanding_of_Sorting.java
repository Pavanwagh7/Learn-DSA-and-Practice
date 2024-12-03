package Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class Basic_Understanding_of_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 24, 6, 1, 9, 10, 2, 4};

        // Bubble Sort Implementation
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for passes
            for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    // Swap using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }
}