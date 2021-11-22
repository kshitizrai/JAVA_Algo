package recursion;

import java.util.ArrayList;
import java.util.List;

import Interfaces.FunStringInterface;

public class GenerateSubSets implements FunStringInterface {


    private void todo(String s, String curr, int i){

        if(i == s.length()) {
            System.out.println(curr);
            return;
        }

        todo(s, curr, i+1);
        todo(s, curr+s.charAt(i), i+1);

        return;

    }

    public void fun(String s){

        todo(s, "", 0);
    }
}
