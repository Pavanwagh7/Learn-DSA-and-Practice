package Recursion.ArrayQuestions;

import java.util.Scanner;
import java.util.ArrayList;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,12,2,5,2,78};
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter target = ");
        int target = sc.nextInt();
        System.out.println(findallIndices(arr,target,0,new ArrayList<>()));
//        int ans1 = fun(arr,target,0);
//        String ans = (ans1 == -1) ? "element not found" : "found at index " + ans1;
//        System.out.println(ans);
        sc.close();
    }
    static int fun(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return fun(arr,target,index + 1);
    }
    //Questions:return the array list which contains an what indices target found,
    //this happen when target element is located at multiple indices in array in which we search for
    static ArrayList<Integer> findallIndices(int[] arr,int target,int index,ArrayList<Integer> indices){
        if (index == arr.length){
            return indices;
        }
        if(target == arr[index])
            indices.add(index);
        return findallIndices(arr,target,index + 1,indices);
    }
}
