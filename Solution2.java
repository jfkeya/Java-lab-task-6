import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            System.out.println(num);
        }

        scanner.close();
    }
}
