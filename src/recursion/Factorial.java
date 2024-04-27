package recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 7;
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact *=i ;
//        }
//        System.out.println(fact);
        int res = fact(n);
        System.out.println(res);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
