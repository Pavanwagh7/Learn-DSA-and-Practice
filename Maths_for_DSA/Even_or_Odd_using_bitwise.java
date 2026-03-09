package Maths_for_DSA;

import java.util.Scanner;

public class Even_or_Odd_using_bitwise {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();

        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
