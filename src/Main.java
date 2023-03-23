import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in); // Độ phức tạp O(1)
        System.out.println("Nhập vào một chuỗi ký tự: "); // Độ phức tạp O(1)
        String str= input.nextLine(); // Độ phức tạp O(1)
        String maxString =""; // Độ phức tạp O(1)
        String currentStr=""; // Độ phức tạp O(1)

        for (int i = 0; i < str.length(); i++) { // Độ phức tạp O(n)
             currentStr= String.valueOf(str.charAt(i)); // Độ phức tạp O(1)
            System.out.println("currentStr "+ currentStr);// Độ phức tạp O(1)
            for (int j = i+1; j < str.length(); j++) { // Độ phức tạp O(m)
                if (currentStr.charAt(currentStr.length()-1)<str.charAt(j)) { // Độ phức tạp O(1)
                    currentStr+= str.charAt(j); // Độ phức tạp O(1)
                }
            }
            if (currentStr.length()>maxString.length()) { // Độ phức tạp O(1)
                maxString= currentStr; // Độ phức tạp O(1)
            }
        }
        System.out.println(currentStr); // Độ phức tạp O(1)

        System.out.println("MaxString "+ maxString); // Độ phức tạp O(1)
    // O(n * m) <---

    }
}