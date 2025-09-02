package Recursion;


import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n = ");
        int n = sc.nextInt();

        System.out.println(f1(n));

    }
    //it's very very very inefficient for bigger numbers ,don't believe ?,enter n = 50
    static int f1(int n){
        //base condition
        //if n is 0 or 1 return n
        if (n < 2)
            return n;

        return f1(n - 1) + f1(n - 2);
    }
}
