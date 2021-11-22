package hashing;

import java.util.HashSet;

public class SubArraySum0 {

    public static void main(String[] args)
    {
        String s[] = "i like this program very much".
                split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            ans += s[i] + " ";
            System.out.println(ans);
        }
        System.out.println("Reversed String:");
        System.out.println(ans.substring(0,
                ans.length() - 1));
    }

    static boolean ZeroSumSubarray(int arr[], int n) {

        HashSet<Integer> set = new HashSet<Integer>();
        int preSum = 0;

        for(int i : arr){

            preSum = preSum + i;
            if(set.contains(preSum)){
                System.out.println(preSum);
                System.out.println("Here");
                return true;
            }
            else if(preSum == 0){
                System.out.println("Here2");
                return true;
            } else{
                set.add(preSum);
            }
        }

        return false;
    }
}
