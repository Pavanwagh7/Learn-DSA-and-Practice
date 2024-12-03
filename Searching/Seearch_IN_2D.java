package Searching;

import java.util.Scanner;
import java.util.Arrays;

public class Seearch_IN_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no. of rows of matrix:");
        int rows = sc.nextInt();

        System.out.println("enter the no. of rows of matrix:");
        int columns = sc.nextInt();

        System.out.println("enter the matrix elements");
        int [][]A = new int[rows][columns];
        //inputting matrix
        for (int i = 0;i<rows;i++){
            for (int j = 0;j<columns;j++)
                A[i][j] = sc.nextInt();
        }

        System.out.println("the entered matrix is:");
        //diplaying matrix
        for (int i = 0;i<rows;i++){
            for (int j = 0;j<columns;j++)
                System.out.print(A[i][j]);
            System.out.println();
        }
        //System.out.println(Arrays.toString(A));this will print address

        System.out.println("which element do you want to find:");
        int target = sc.nextInt();

        int isfound = funSearch(A,target,rows,columns) ;
        if (isfound == 1)
            System.out.println("target is found in the matrix");
        else
            System.out.println("target does not found in the matrix");

    }
    static int funSearch(int [][]A,int target,int rows,int columns){
        for (int i = 0;i<rows;i++){
            for (int j = 0;j<columns;j++) {
                if (A[i][j] == target)
                    return 1;
                }
        }
        return 2;
    }
}