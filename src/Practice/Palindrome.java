package Practice;

public class Palindrome {
    public static void main(String[] args) {
//        String str = "kota";
//        String revstr = "";
//        char ch =' ';
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            revstr = ch + revstr;
//        }
//        if (revstr.equals(str)){
//            System.out.println("is Palindrome");
//        }
//        else {
//            System.out.println("is not a Palindrome");
//        }
        int x=101;
        String str3 = String.valueOf(x);
        String str4 = "";
        System.out.println(str3);
        char ch =' ';
        for (int i = 0; i < str3.length(); i++) {
            ch = str3.charAt(i);
            str4 = ch + str4;
        }
        if (str4.equals(str3)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
