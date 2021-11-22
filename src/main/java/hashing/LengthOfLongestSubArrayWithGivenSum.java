package hashing;

import java.util.HashMap;

public class LengthOfLongestSubArrayWithGivenSum {

    public static void main (String[] args) {
        int arr[] = new int[]{8, 3, -7, -4, 1};
        int n = arr.length;
        int sum = -8;

        System.out.println(largestSubarrayWithSumX(arr, n, sum));

    }

    static int largestSubarrayWithSumX(int arr[], int n, int sum) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int preSum = 0;
        int result=-1;
        for(int i=0 ; i < n ; i++){

            preSum = preSum + arr[i];
            if(map.containsValue(preSum)){
                continue;
            } else if(map.containsValue(preSum-sum)){
                result = Math.max(result, i-map.get(preSum-arr[i]));
            } else if(preSum == sum){
                result = i+1;
            } else {
                map.put(preSum, i);
            }
        }
        return result;
    }


}
