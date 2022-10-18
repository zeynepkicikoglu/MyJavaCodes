import java.util.Scanner;
public class DongulerPratik2 {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.println("Bir sayı giriniz:");
                sayi = input.nextInt();
                if(sayi%4==0)
                    toplam+=sayi;
            }while(sayi%2==0);
        }
        System.out.println("Toplam sonucu:" +toplam);
    }
}
