package Sorting;

public class Checking_Sorted {
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2};

        boolean result = m1(arr);
        if(result == true)
            System.out.println("ascending sorted");
        else
            System.out.println("descending sorted");
    }
    static boolean m1(int[] arr){
        if(arr[0] < arr[arr.length -1])
            return true;
        else
            return false;

        //return arr[0] < arr[arr.length - 1];  // Directly return the comparison result
    }
}