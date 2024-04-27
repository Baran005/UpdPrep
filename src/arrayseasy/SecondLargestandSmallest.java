package arrayseasy;

public class SecondLargestandSmallest {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i : a){
            if(i > max){
                secondMax = max;
                max = i;
            }else if(i > secondMax){
                secondMax = i;
            }

            if(i < min){
                secondMin = min;
                min = i;
            }else if(i < secondMin){
                secondMin = i;
            }
        }
        return new int []{secondMax,secondMin};
    }
}
