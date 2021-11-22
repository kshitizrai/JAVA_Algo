package recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SubsetsSum {

    static Integer count = 0;

    private int getResult(List<Integer> list,  int n, int sum){

        if(n == 0){
            return ((sum==0) ? 1 : 0);
        }
        return getResult(list, n-1, sum) + getResult(list, n-1, sum-list.get(n-1));

    }

    public void fun(List<Integer> list, int sum){

        System.out.println(getResult(list, list.size(), sum));
    }
}
