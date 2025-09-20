package Recursion.Strings_Subsets_Subsequences;

//find the subsequences of the string "abc"

public class SubSequence {
    public static void main(String[] args) {
        subseq("","abc");
    }
    static void subseq (String p,String up) {
        //base case
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);//acces first char of unprocessed(up) string

        //add char ch to p
        subseq(p + ch,up.substring(1));

        //dont add char ch to p
        subseq(p,up.substring(1));
    }
}
