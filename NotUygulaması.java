import java.util.Scanner;
public class NotUygulaması {
    public static void main(String[] args){
        int mat,fiz,kim,turk,tarih,muz;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Matematik notunuzu giriniz:");
            mat=input.nextInt();
            System.out.println("Fizik notunuzu giriniz:");
            fiz=input.nextInt();
            System.out.println("Kimya notunuzu giriniz:");
            kim=input.nextInt();
            System.out.println("Türkçe notunuzu giriniz:");
            turk=input.nextInt();
            System.out.println("Tarih notunuzu giriniz:");
            tarih=input.nextInt();
            System.out.println("Müzik notunuzu giriniz:");
            muz=input.nextInt();
        }
        double sonuc=(mat+kim+fiz+tarih+turk+muz)/6;
        String durum= sonuc >60 ? "Sınıfı geçti": "Sınıfta kaldı";
        System.out.print("Ortalamanız:" + sonuc + "\nDurumunuz:" + durum + ".");
    }
}

