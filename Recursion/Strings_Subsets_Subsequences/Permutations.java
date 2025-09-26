package Recursion.Strings_Subsets_Subsequences;

import java.lang.reflect.Array;
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
//        System.out.println(store_permutations("","abc",new ArrayList<>()));
        System.out.println(store_permutations("","abc"));
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

    static List<String> store_permutations(String p, String up, List<String> list) {
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
            List<String> l1 = store_permutations(f + ch + s, up.substring(1),list);
        }
        return list;
    }

    //take variables inside the method
    static List<String> store_permutations(String p, String up) {
        //base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);//accesing first character of unproccesed(up) string

        ArrayList<String> ans = new ArrayList<>();//Local to this call

        //number of variable function calls
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(store_permutations(f + ch + s,up.substring(1)));
        }
        return ans;
    }
}
