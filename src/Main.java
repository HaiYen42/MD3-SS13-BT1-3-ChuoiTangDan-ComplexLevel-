import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi ký tự: ");
        String str= input.nextLine();
        String maxString ="";
        String currentStr="";

        for (int i = 0; i < str.length(); i++) {
             currentStr= String.valueOf(str.charAt(i));
            System.out.println("currentStr "+ currentStr);
            for (int j = i+1; j < str.length(); j++) {
                if (currentStr.charAt(currentStr.length()-1)<=str.charAt(j)) {
                    currentStr+= str.charAt(j);
                }
            }
            if (currentStr.length()>maxString.length()) {
                maxString= currentStr;
            }
        }
        System.out.println(currentStr);

        System.out.println("MaxString "+ maxString);


    }
}