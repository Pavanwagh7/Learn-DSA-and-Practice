package Pattern_Printing;

import java.util.Scanner;

/*
print the pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();// input the number of rows

        pattern4(n);//call  the method to print pattern
    }
    static  void pattern4(int n){

        for (int row = 1; row <= n; row++) {//run for rows
            //for columns
            //for i th row there are i columns in the i th row
            for (int column = 1; column <= row ; column++) {
                System.out.print(column + " ");//print column
            }
            System.out.println();//nextLine
        }
    }
}
