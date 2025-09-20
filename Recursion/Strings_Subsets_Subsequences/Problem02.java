package Recursion.Strings_Subsets_Subsequences;

//Q1. skip apple
//Q2. skip app not apple

public class Problem02 {
    public static void main(String[] args) {
        Problem02 p2 = new Problem02();
        //System.out.println(p2.skip_apple("dcappleiwuapplefb"));

        System.out.print(p2.skip_appNot_apple("Paapplvan"));
    }
    //skip apple
    String skip_apple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple"))
            return skip_apple(up.substring(5));
        else
            return up.charAt(0) + skip_apple(up.substring(1));
    }

    //skip app when it is not apple
    String skip_appNot_apple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple"))
            return skip_appNot_apple(up.substring(3));
        else
            return up.charAt(0) + skip_appNot_apple(up.substring(1));
    }
}
