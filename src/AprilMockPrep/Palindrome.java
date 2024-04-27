package AprilMockPrep;

public class Palindrome {
    public static void main(String[] args) {
        String str = "baran";
        isPalindrome(str);
    }
    static boolean isPalindrome(String str){
        String revstr = "";
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            revstr = c + revstr;
        }
        return revstr.equals(str);
    }
}
