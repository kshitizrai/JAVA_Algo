package recursion;

public class RopeCutting {

    private int ropeCuts(int n, int a, int b, int c){

        if(n<0){
            return -1;
        }
        else if(n==0){
            return 0;
        }

        int cutsA = ropeCuts(n-a,a,b,c);
        int cutsB = ropeCuts(n-b,a,b,c);
        int cutsC = ropeCuts(n-c,a,b,c);

        int result = Math.max(Math.max(cutsA,cutsB),cutsC);

        return result == -1 ? result : 1+result;
    }

    public void fun(int n, int a, int b, int c){

        System.out.println(ropeCuts(n,a,b,c));
    }
}
