import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int sayi,toplam=0;
            System.out.println("Bir sayı giriniz:");
            sayi=input.nextInt();
            for(int i=1;i<sayi;i++){
                if(sayi%i==0){
                    toplam+=i;
                }
            }
            if(toplam==sayi)
                System.out.println(sayi+" bir mükemmel sayıdır.");
            else
                System.out.println(sayi+" bir mükemmel sayı değildir.");
        }
    }
}
