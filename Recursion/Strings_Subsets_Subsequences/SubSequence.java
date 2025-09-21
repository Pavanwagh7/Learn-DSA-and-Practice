package Recursion.Strings_Subsets_Subsequences;
import java.util.ArrayList;
//Q.find the subsequences of the string "abc"

public class SubSequence {
    public static void main(String[] args) {
        //subseq("","abc");
        //System.out.println(subseqRt("","abc"));
        //subseqASCII("","abc");
        System.out.println(subseqAsciiRt("","abc"));
    }
    //subseq
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

    //Strore and return subsequences instead of printing
    static ArrayList<String> subseqRt(String p, String up) {
        //base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);//acces first char of unprocessed(up) string

        //add char ch to p
        ArrayList<String> left = subseqRt(p + ch,up.substring(1));

        //dont add char ch to p
        ArrayList<String> right = subseqRt(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    //ASCII
    static void subseqASCII (String p,String up) {
        //base case
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);//acces first char of unprocessed(up) string

        //add char ch to p
        subseqASCII(p + ch,up.substring(1));

        //dont add char ch to p
        subseqASCII(p,up.substring(1));

        subseqASCII(p + (ch+0),up.substring(1));
    }

    //return ASCII
    static ArrayList<String> subseqAsciiRt(String p, String up) {
        //base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);//acces first char of unprocessed(up) string

        //add char ch to p
        ArrayList<String> first = subseqAsciiRt(p + ch,up.substring(1));

        //dont add char ch to p
        ArrayList<String> second = subseqAsciiRt(p,up.substring(1));
        ArrayList<String> third = subseqAsciiRt(p + (ch + 0),up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
