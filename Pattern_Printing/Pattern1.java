package Pattern_Printing;

/*
print the pattern
* * * *
* * * *
* * * *
* * * *

 */
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n = ");
        int n = sc.nextInt();//numbers of rows in pattern

        pattern(n);
    }
    static void pattern(int n){
        //for rows
        for (int rows = 1; rows <= n ; rows++) {
            //for columns
            for (int columns = 1; columns <= n; columns++) {
                System.out.print("* ");
            }
            //when one row is printed,add a new line
            System.out.println();
        }
    }
}
