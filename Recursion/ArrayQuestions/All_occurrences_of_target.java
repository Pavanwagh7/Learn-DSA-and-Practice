package Recursion.ArrayQuestions;

import java.util.ArrayList;

public class All_occurrences_of_target {
    public static void main(String[] args) {
        System.out.println(findAllIndex(new int[]{1,23,3,3,4,5},3,0));
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        //this will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansfromBelowCalls = findAllIndex(arr,target,index + 1);
        list.addAll(ansfromBelowCalls);

        return list;
    }
}
