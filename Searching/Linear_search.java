package Searching;

import java.util.Scanner;
//searching a number
public class Linear_search {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int[] arr = {23,13,14,56,89,98,76,84};

       System.out.println("enter the number you wanna search:");
       int target = sc.nextInt();

       int answer = search(arr,target);
        if (answer == -1)
            System.out.println("number does not found");
        else
            System.out.println("number found at the index "+ answer+" 0r at "+(answer+1)+"th place in the array");

        sc.close();
    }

    //search method-->for searching number in the array or not
    static int search(int[] arr,int number){
        //search will return -1 if it doesnt found it else return index
        if (arr.length == 0)
            return -1;

        //run a for loop
        for (int index = 0;index < arr.length;index++) {
            if (arr[index] == number) {
                return index;
            }
        }
        //this line will be executed if none of the return statements have executed
        //hence the target not found
        return -1;
    }
}