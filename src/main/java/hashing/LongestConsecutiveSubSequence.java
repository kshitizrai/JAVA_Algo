package hashing;

import java.util.HashSet;

public class LongestConsecutiveSubSequence {

    public static void main (String[] args) {
        int arr[] = new int[]{1, 9, 3, 4, 2, 10, 13};

        int n = arr.length;

        System.out.println(findLongest(arr, n ));

    }

    static int findLongest(int arr[], int n) {

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : arr){
            set.add(i);
        }
        int result = -1;
        for(int i : arr){
            int current = 1;
            if(!set.contains(i-1)){
                while(set.contains(i+1)){

                    current++;
                    i = i+1;
                }
                result = Math.max(result,current);
            }
        }
        return result;
    }
}
