package paytm;

public class Interview {

    static String reverse(String str){

        int left = 0;
        int right = str.length() - 1;

        while(left<right){

//            System.out.println("Left = " + left + "" + "right = " + right);
            str = swap(str,right,left);
            left++;
            right--;
        }
        return str;
    }

    private static String swap(String str, int right, int left){

        Character rightMost = str.charAt(right); //'Z'
        Character leftMost = str.charAt(left); //'K'

        str = str.substring(0,left) + rightMost + str.substring(left+1,right) + leftMost + str.substring(right+1);

        return str;
    }

    public static void main(String[] args){

        String str = "Vishal";

        System.out.println(reverse(str));
    }
}
