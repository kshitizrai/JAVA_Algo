package recursion;

import Interfaces.FunIntInterface;

public class SumOfDigits implements FunIntInterface {


    private int sumDigits(int n){

        if(n/10 == 0){

            return n;
        }

        return n%10 + sumDigits(n/10);
    }

    public void fun(int n) {

        System.out.println(sumDigits(n));
    }
}
