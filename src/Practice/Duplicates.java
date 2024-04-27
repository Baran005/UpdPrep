package Practice;

public class Duplicates {
    public static void main(String[] args) {
        int [] arr = {2,4,4,5,5,5,7,9,9};

       int rd = removedup(arr);
        for (int i = 0; i < rd ; i++) {
            System.out.print(arr[i] + " ");
        }
        }

    static int removedup(int arr[]){
        int rd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[rd] != arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd + 1;
    }
}
