package hashing;

import java.util.HashMap;

public class DistinctElementsInEveryWindow {

    public static void main (String[] args)
    {
        int arr[] = new int[]{10, 10, 5, 3, 20, 5};

        int n = arr.length;
        int k=4;
        printDistinct(arr, n, k);

    }

    static void printDistinct(int arr[], int n, int k) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0 ; i<n ; i++){

            if(i >= k){

                int value = map.get(arr[i-k]);
                if(value == 1){
                    map.remove(arr[i-k]);
                } else {
                    map.put(arr[i-k], map.get(arr[i-k])-1);
                }
            }

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
            if(i >= k-1){
                System.out.println(map.size());
            }
        }
    }
}
