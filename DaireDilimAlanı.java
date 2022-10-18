import java.util.Scanner;

public class DaireDilimAlanı {
    public static void main(String[] args) {
        double r, a;
        double pi = 3.14;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Dairenin yarıçapını giriniz:");
            r = input.nextInt();
            System.out.println("Dairenin merkez açısının ölçüsünü giriniz:");
            a = input.nextInt();
        }
        double alan = (pi * (r * r) * a) / 360;
        System.out.println("Daire Diliminin Alanı:" + alan);
    }
}
