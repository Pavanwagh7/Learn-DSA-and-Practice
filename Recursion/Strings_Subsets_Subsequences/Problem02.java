package Recursion.Strings_Subsets_Subsequences;

public class Problem02 {
    public static void main(String[] args) {
        Problem02 p2 = new Problem02();

        System.out.print(p2.skip_apple("Paapplevan"));
    }
    String skip_apple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple"))
            return skip_apple(up.substring(5));
        else
            return up.charAt(0) + skip_apple(up.substring(1));
    }
}
