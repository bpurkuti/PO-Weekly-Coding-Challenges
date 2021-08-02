
/** 
Write java Program to Find Smallest and Largest Element in an Array.
Note: Number can not be repeated in the array.
Input: int[] arr1={7,5,6,1,4,2}; Output: 1, 7
**/
import java.util.*;

public class MinMaxArray {

    public static int[] minMax(int[] arr) {

        int[] result = new int[2];
        Arrays.sort(arr);
        result[0] = arr[0];
        result[1] = arr[arr.length - 1];

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 5, 6, 1, 4, 2 };

        arr1 = minMax(arr1);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

}