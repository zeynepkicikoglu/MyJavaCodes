import java.util.Scanner;
public class ElmasCizimi {
    public static void main(String[] args) {
        int n;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Bir sayı giriniz:");
            n = input.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}