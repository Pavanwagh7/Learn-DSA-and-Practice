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
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n = ");
        int n = sc.nextInt();

        pattern6(n);
    }
    static void pattern6(int n){
        //total number of rows (2 * n - 1)
        for (int row = 0; row < 2*n; row++) {
            //find total numbers of columns in particular row
            int totalNumberOFCoulumnsInRow =  row > n ? 2 * n - row : row ;

            //total spaces in a particular row
            int totalSpaces = n - totalNumberOFCoulumnsInRow;
            for (int s = 0;s < totalSpaces;s++){
                System.out.print(" ");//print space
            }

            //columns
            for (int column = 0; column < totalNumberOFCoulumnsInRow; column++) {
                System.out.print("* ");//print star
            }
            System.out.println();//newLine
        }
    }

}
