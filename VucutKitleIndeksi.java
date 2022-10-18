import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args){
        double vki,boy,kilo;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Lütfen boyunuzu metre cinsinden giriniz:\n");
            boy =input.nextDouble();
            System.out.print("Lütfen kilonuzu giriniz:\n");
            kilo =input.nextDouble();
        }
        vki=(kilo/(boy*boy));
        System.out.print("Vücut Kitle İndeksiniz:" +vki);
    }
}