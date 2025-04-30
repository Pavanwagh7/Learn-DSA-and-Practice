package Pattern_Printing;

import java.util.Scanner;

/*
print the pattern
*
* *
* * *
* * * *


 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n = ");
        int n = sc.nextInt();

        pattern2(n);
        sc.close();
    }
    static void pattern2(int n){
        //for rows
        for (int rows = 1;rows <= n;rows++){
            //for row run column
            //for i th row iterate inner for loop i times
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("* ");
            }
            //when one row is printed,add a new line
            System.out.println();
        }
    }
}
