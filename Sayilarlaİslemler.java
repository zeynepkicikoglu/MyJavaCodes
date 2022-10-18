import java.util.Scanner;
public class Sayilarlaİslemler {
    public static void main(String[] args) {
        int sayi, toplam=0,sayac=0;
        double sonuc;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Bir sayı giriniz:");
            sayi = input.nextInt();
        }
        for(int i=0;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                toplam+=i;
                sayac+=1;
            }
        }
        sonuc=toplam/sayac;
        System.out.println("Ortalama:"+sonuc);
    }
}