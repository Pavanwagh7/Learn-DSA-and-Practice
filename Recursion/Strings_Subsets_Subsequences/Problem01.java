package Recursion.Strings_Subsets_Subsequences;

//Q. Delete all the 'a' ans 'A' from the given string

public class Problem01 {
    public static void main(String[] args) {
        //System.out.println(delete("Pavan"));
        //System.out.println(recursive_delete("Paaaavaaanaaak",0,""));
        skip("","PAaaavaAanaaa");
    }

    //without using iterator
    // p - processed string
    //up - unprocessed string
    static void skip (String p,String up) {
        //base case : if string up is empty,it means you have reached the end of the string now you can print the processed p string
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a' || ch == 'A')
            skip (p,up.substring(1));
        else
            skip(p + ch,up.substring(1));
    }

    //Recurssive method
    static String recursive_delete(String s, int iterator, String ans) {
        //base conditon
        if (iterator == s.length()) {
            return ans;
        }
        if (s.charAt(iterator) == 'a') {
            return recursive_delete(s,iterator + 1,ans);
        }
        return s.charAt(iterator) + "" + recursive_delete(s,iterator + 1,ans);
    }

    //Using Loops
    static String delete (String s) {
        String ans = new String();

        for (int i = 0;i < s.length();i++) {
            if (s.charAt(i) == 'a') {
                continue;
            }
            else {
                ans = ans + s.charAt(i);
            }
        }
        return ans;
    }
}
