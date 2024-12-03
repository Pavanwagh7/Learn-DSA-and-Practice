package Searching;

import java.util.Scanner;

public class Lenear_Search_in_the_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "pavan";

        System.out.println("enter the charater you want to find:");
        char target = sc.next().trim().charAt(0);
        boolean ans = stringCheck(name,target);
        if (ans == true)
            System.out.println("charater '"+target+"' is present in the name 'pavan'");
        else
            System.out.println("charater '"+target+"' isn't present in the name 'pavan'");

        sc.close();
    }
    static boolean stringCheck(String name,char target){
        for (int i = 0 ;i < name.length();i++){
            if((name.charAt(i)) == target)
                return true;
        }
        return false;
    }
}
