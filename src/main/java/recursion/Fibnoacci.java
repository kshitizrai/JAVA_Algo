package recursion;

import Interfaces.FunIntInterface;

public class Fibnoacci implements FunIntInterface {

    private int fib(int n){

        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public void fun(int n){

        System.out.println(fib(n));
    }
}
