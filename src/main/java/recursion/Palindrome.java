package recursion;

import Interfaces.FunStringInterface;

public class Palindrome implements FunStringInterface {

    public void fun(String s) {
        System.out.println(check(s));
    }

    private boolean check(String n){

        if(n.length() == 0){

            return true;
        } else if(n.length() == 1){

            return false;
        }

        if(n.charAt(0) == n.charAt(n.length()-1)){

            return check(n.substring(1, n.length()-1));
        }
        else{

            return false;
        }
    }
}
