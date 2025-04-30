package Pattern_Printing;

import java.util.Scanner;

/*
print the pattern
* * * * *
* * * *
* * *
* *
*

 */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n = ");
        int n = sc.nextInt();//number of rows

        pattern3(n);//call
    }
    static void pattern3(int n){
        //number of rows
        for (int rows = 1; rows <= n ; rows++) {
            //number of columns each row
            //for i th row, there are n-i-1 number of columns in the row
            for (int columns = 1; columns <= n - rows + 1; columns++) {
                System.out.print("* ");
            }
            //print a line when one row is printed
            System.out.println();
        }
    }
}
