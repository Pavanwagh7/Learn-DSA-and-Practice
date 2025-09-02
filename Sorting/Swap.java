package Sorting;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = 2;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}


/*
//using temporary variable

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = 2;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}

*/