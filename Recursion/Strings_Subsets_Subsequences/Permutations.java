package Recursion.Strings_Subsets_Subsequences;

import java.util.ArrayList;
import java.util.List;

//Q. find the Permutations of the string "abc"?
/*
output should be
cba
bca
bac
cab
acb
abc
*/
public class Permutations {
    public static void main(String[] args) {
//        permutations("","abc");
        System.out.println(permutations("","abc",new ArrayList<>()));
    }
    static void permutations (String p,String up) {
        //base case
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);//accesing first character of unproccesed(up) string

        //number of variable function calls
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static List<String> permutations (String p, String up, List<String> list) {
        //base case
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);//accesing first character of unproccesed(up) string

        //number of variable function calls
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            List<String> l1 = permutations(f + ch + s, up.substring(1),list);
        }
        return list;
    }
}
