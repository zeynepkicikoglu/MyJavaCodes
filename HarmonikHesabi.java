import java.util.Scanner;
public class HarmonikHesabi {
    public static void main(String[] args) {
        int n;
        double harmonik=0.0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("N sayısını giriniz:");
            n = input.nextInt();
        }
        for(double i=1;i<=n;i++){
            harmonik+=(1/i);
        }
        System.out.println("Harmonik ortalama sonucu:" + harmonik);
    }
}
