import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        int sayi,toplam=0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Bir sayı yazınız:");
            sayi=input.nextInt();
        }
        while(sayi%10!=0){
            toplam+=(sayi%10);
            sayi=sayi/10;
        }
        System.out.println("Basamak toplamı:"+toplam);
    }
}
