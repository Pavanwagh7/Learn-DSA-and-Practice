package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n = ");
        int n =sc.nextInt();

        double sqrt = find_SQ_root(n);
        System.out.println(sqrt);
    }
    static double find_SQ_root(int n){
        return Math.sqrt(n);
    }
}