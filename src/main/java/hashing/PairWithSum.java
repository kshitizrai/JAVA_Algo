package hashing;

import java.io.InputStream;
import java.util.HashSet;

public class PairWithSum {

    static Boolean pairWithSumX(int arr[], int len,int sum){

        HashSet<Integer> set = new HashSet<Integer>();

        for(Integer i : arr){

            if(set.contains(sum-i)){
                return true;
            } else{
                set.add(i);
            }
        }
        return false;
    }

    public static void main (String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 0, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(pairWithSumX(arr, len, x));
    }
}
