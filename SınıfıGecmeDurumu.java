import java.util.Scanner;
public class SınıfıGecmeDurumu {
    public static void main(String[] args) {
        int mat, fiz, kim, turk, tarih, muz,bolum=6;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Matematik notunuzu giriniz:");
            mat = input.nextInt();
            if (!(mat > 0 && mat <= 100)) {
                mat = 0;
                bolum -= 1;
            }
            System.out.println("Fizik notunuzu giriniz:");
            fiz = input.nextInt();
            if (!(fiz > 0 && fiz <= 100)) {
                fiz = 0;
                bolum -= 1;
            }
            System.out.println("Kimya notunuzu giriniz:");
            kim = input.nextInt();
            if (!(kim > 0 && kim <= 100)) {
                kim = 0;
                bolum -= 1;
            }
            System.out.println("Türkçe notunuzu giriniz:");
            turk = input.nextInt();
            if (!(turk > 0 && turk <= 100)) {
                turk = 0;
                bolum -= 1;
            }
            System.out.println("Tarih notunuzu giriniz:");
            tarih = input.nextInt();
            if (!(tarih > 0 && tarih <= 100)) {
                tarih = 0;
                bolum -= 1;
            }
            System.out.println("Müzik notunuzu giriniz:");
            muz = input.nextInt();
        }
        if (!(muz > 0 && muz <= 100)) {
            muz = 0;
            bolum -= 1;
        }
        double sonuc = (mat + kim + fiz + tarih + turk + muz) / bolum;
        if (sonuc < 55)
            System.out.println("Sınıfta kaldınız.");
         else
            System.out.println("Sınıfı geçtiniz.");

        System.out.print("Ortalamanız:" + sonuc);
    }
}
