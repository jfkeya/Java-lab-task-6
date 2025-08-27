import java.util.*;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // consume newline

        for (int i = 0; i < t; i++) {
            String numStr = sc.nextLine();
            try {
                long num = Long.parseLong(numStr);
                System.out.println(num + " can be fitted in:");
                
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // every valid long is also checked
                System.out.println("* long");
                
            } catch (Exception e) {
                // if it overflows long
                System.out.println(numStr + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}