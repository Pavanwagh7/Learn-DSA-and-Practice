package Pattern_Printing;

import java.util.Scanner;

/*
print the pattern

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n = ");
        int n = sc.nextInt();
        //approach1(n);
        approach2(n);
    }
    //Approach 1
    static void approach1(int n){

        //Logic : refer 'Pattern2' question
        for (int row = 1; row <= n ; row++) {
            //for i th row there are i columns in th i th row
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");//print
            }
            System.out.println();//nextLine
        }

        //Logic : refer 'Pattern3' question
        //now once 1 to n printed ,start printing 1 to n - 1
        for (int row = 1; row <= n - 1 ; row++) {//rows
            //columns
            for (int column = 1; column <= n - 1 - row + 1; column++) {
                System.out.print("* ");//print
            }
            System.out.println();//nextLine
        }
    }


    //Approach 2
    static void approach2(int n){
        for (int row = 0; row < 2 * n ; row++) {
            //int totalColumnsInRow = row > n ? 2 * n - row : row ;  // OR
            int totalColumnsInRow;
            if (row > n) {
                totalColumnsInRow = 2 * n - row;
            }
            else {
                totalColumnsInRow = row;
            }
            for (int column = 0; column < totalColumnsInRow; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
