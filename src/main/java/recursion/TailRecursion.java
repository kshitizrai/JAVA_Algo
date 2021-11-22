package recursion;

import Interfaces.FunIntInterface;

// Recursive function is the last call in the recursive function
public class TailRecursion implements FunIntInterface {

    public void fun(int n){

        if(n==0){

            return;
        }
        System.out.println(n);
        fun(n-1);
    }


}
