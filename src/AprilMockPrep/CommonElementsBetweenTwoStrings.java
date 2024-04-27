package AprilMockPrep;

public class CommonElementsBetweenTwoStrings {
    public static void main(String[] args) {
        String one = "Baran";
        String two = "Vasan";
      StringBuilder commonElements = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            char c1 = one.charAt(i);
            for (int j = 0; j < two.length(); j++) {
                char c2 = two.charAt(j);
                if (c1 == c2){
                    commonElements.append(c1);
                }else{
                    break;
                }
            }
        }
        System.out.println(commonElements);
    }
}
