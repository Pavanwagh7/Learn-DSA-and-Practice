package Recursion.Strings_Subsets_Subsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,3};
//
//        List<List<Integer>> ans = subset(arr1);
//
//        for (List<Integer> list : ans)
//            System.out.println(list);


        //for array containing duplicate elements
        int[] arr2 = {1,2,2};

        List<List<Integer>> ans = subsetRemoveDuplicate(arr2);

        for (List<Integer> list : ans)
            System.out.println(list);

    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());// start with empty subset

        for(int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));// copy existing subset
                internal.add(num);// add current element
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetRemoveDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());// start with empty subset

        int start = 0;
        int end = 0;

        Arrays.sort(arr);

        for(int i = start;i < arr.length;i++) {
            start = 0;
            //if current and previous element are same,s = e + 1
            if (i > 0 && arr[i] == arr[i-1])
                start = end + 1;

            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));// copy existing subset
                internal.add(arr[i]);// add current element
                outer.add(internal);
            }
        }
        return outer;
    }
}