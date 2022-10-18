/* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */

import java.util.Scanner;
public class KdvTutarı {
    public static void main(String[] args){
        double girilentutar, kdv,sonuc;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Girilen Tutar:");
            girilentutar =input.nextInt();
        }
        kdv = (girilentutar>0 && girilentutar<=1000) ? 0.18 : 0.08;
        sonuc = girilentutar+(girilentutar*kdv);
        System.out.print("Ödenecek Tutar:" + sonuc +" TL'dir.");
    }
}