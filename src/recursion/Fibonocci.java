package recursion;

public class Fibonocci {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(res(n));
    }

    static int res(int n) {

            if(n==1 || n==2){
                return 1;
            }

        return n*(n+1)/2;
    }
}
//    static int fibonoccinum(int n){
//        if(n==0)
//            return 0;
//
//        if(n==1|| n==2){
//            return 1;
//        }
//        return n*(n-1)/2;
//    }

