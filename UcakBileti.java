import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int yas,tip;
        double yol,tutar = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Mesafeyi km türünden giriniz:");
            yol = input.nextDouble();
            System.out.println("Yaşınız:");
            yas = input.nextInt();
            System.out.println("1-Tek yön\n2-Gidiş/Dönüş\nYolculuk tipiniz:");
            tip = input.nextInt();
        }

        if(yol>0 && yas>0 && (tip==1 || tip==2)) {


            if (yas < 12) {
                if (tip == 2) {
                    tutar = yol * 0.10;
                    tutar -= tutar * 0.5;
                    tutar -= tutar * 0.2;
                    tutar *= 2;
                } else {
                    tutar = yol * 0.10;
                    tutar -= tutar * 0.5;
                }
            } else if (yas >= 12 && yas <= 24) {
                if (tip == 2) {
                    tutar = yol * 0.10;
                    tutar -= tutar * 0.1;
                    tutar -= tutar * 0.2;
                    tutar *= 2;
                } else {
                    tutar = yol * 0.10;
                    tutar -= tutar * 0.1;
                }

            } else if (yas > 65) {
                if (tip == 2) {
                    tutar = yol * 0.10;
                    tutar -= tutar * 0.3;
                    tutar -= tutar * 0.2;
                    tutar *= 2;
                } else {
                    tutar = yol * 0.10;
                    tutar -= tutar * 0.3;
                }
            } else if (yas > 24 && yas <= 65) {
                if (tip == 2) {
                    tutar = yol * 0.10;
                    tutar -= tutar * 0.2;
                    tutar *= 2;
                } else {
                    tutar = yol * 0.10;
                }
            }
        }
        else
            System.out.println("Hatalı Veri Girdiniz!");

        
        System.out.println("Ödenecek tutarınız:" + tutar);
    }
}
