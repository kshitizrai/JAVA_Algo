package recursion;

import Interfaces.FunIntInterface;

public class Factorial implements FunIntInterface {

    private int fact(int n){

        // 1 is wrong because what if n=0
        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }

    public void fun(int n){

        System.out.println(fact(n));
    }
}
