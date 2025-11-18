import java.util.Scanner;

public class SmallCapitalSqaure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (i + 64));
                } else {
                    System.out.print((char) (i + 96));
                }
            }
            System.out.println();
        }
    }
}
