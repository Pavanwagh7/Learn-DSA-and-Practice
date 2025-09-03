package Recursion.ArrayQuestions;

public class ArraySortedorNot {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,1};
        System.out.println(issorted(arr,0));

    }
    //way 1
//    static boolean isSorted(int[] arr,int index) {
//        if(index == arr.length)
//            return true;
//        if (arr[index] < arr[index - 1])
//            return false;
//        return isSorted(arr,index + 1);
//    }
    //way 2
    static boolean issorted(int[] arr,int i){
        //base case
        if(i == arr.length - 1)
            return true;
        return arr[i] < arr[i + 1] && issorted(arr,i + 1);
    }
}
