package Recursion;

import java.util.Scanner;

public class NumberExample {
    public static void main(String[] args) {
        //write a fuction that takes in a number and prints numbers from 1 till that number
        // (e.g if number is n then output should be 1,2,3,4,...,n)
        Scanner sc = new Scanner(System.in);

        print(1);
    }
    static void print(int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
