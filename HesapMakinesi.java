import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
        int number1,number2,secim,sonuc;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Birinci sayı:");
            number1=input.nextInt();
            System.out.println("İkinci sayı:");
            number2=input.nextInt();

            System.out.println("Yapmak istediğiniz işlemi seçiniz:\n" +
                    "1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n " +
                    "Seçiminizi giriniz:");
            secim=input.nextInt();
        }

        switch(secim){
            case 1:
                sonuc = number1 + number2;
                System.out.println("Girdiğiniz sayıların toplamı:" +sonuc);
                break;
            case 2:
                sonuc = number1 - number2;
                System.out.println("Girdiğiniz sayıların çıkarması:" +sonuc);
                break;
            case 3:
                sonuc = number1 * number2;
                System.out.println("Girdiğiniz sayıların çarpımı:" +sonuc);
                break;
            case 4:
                if (number2==0)
                    System.out.println("Bir sayı sıfıra bölünemez.");
                else {
                    sonuc =number1 / number2;
                    System.out.println("Girdiğiniz sayıların bölümü:" + sonuc);
                }
                break;
            default:
                System.out.println("Hatalı seçim");
                break;
        }
    }
}
