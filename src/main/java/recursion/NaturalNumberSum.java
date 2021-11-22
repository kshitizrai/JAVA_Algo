package recursion;

import Interfaces.FunIntInterface;

public class NaturalNumberSum implements FunIntInterface {

    private int sum(int n){

        if(n==0){

            return 0;
        }

        return n + sum(n-1);
    }

    public void fun(int n) {

        System.out.println(n);
    }
}
