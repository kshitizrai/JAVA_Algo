package recursion;

import com.sun.deploy.util.StringUtils;

public class GeneratePermutations {

    public void permute(String s, int index){

        if(index == s.length()-1){
            System.out.println(s);
            return;
        }

        for(int j=index ; j<s.length() ; j++){

            s = swap(s,j,index);
            permute(s,index+1);
            swap(s,index,j);
        }
    }

    private String swap(String s, int j, int i){

        char toSwap = s.charAt(j);
        s = s.substring(0, j) + s.charAt(i) + s.substring(j+1);
        s = s.substring(0, i) + toSwap + s.substring(i+1);

        return s;
    }


}
