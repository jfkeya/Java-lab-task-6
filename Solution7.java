import java.util.*;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            StringBuilder line = new StringBuilder();
            int curr = a;
            int add = b;

            for (int i = 0; i < n; i++) {
                curr += add;          // add b*2^i
                line.append(curr);
                if (i + 1 < n) line.append(' ');
                add <<= 1;            // multiply by 2
            }
            System.out.println(line);
        }
        sc.close();
    }
}