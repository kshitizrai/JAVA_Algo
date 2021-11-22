package hashing;

import java.util.HashSet;

public class SumArray {

    private static boolean isSum(int[] nums, int size, int sum){

        HashSet<Integer> set = new HashSet<Integer>();
        int preSum = 0;
        for(int i : nums){

            preSum = preSum + i;
            if(preSum == sum){
                return true;
            }
            if(set.contains(preSum-sum)){

                return true;
            }
            else{
                set.add(preSum);
            }
        }
        return false;
    }

    public static void main(String[] args){

        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        int n = arr.length;

        System.out.println(isSum(arr, n, sum));
    }
}
