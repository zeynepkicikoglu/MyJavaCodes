import java.util.Scanner;
public class UsHesabi {
    public static void main(String[] args) {
        int a, b;
        int sonuc=1;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Taban değeri:");
            a=input.nextInt();
            System.out.println("Kuvvet değeri:");
            b=input.nextInt();
        }
        for(;b>0;b--){
            sonuc*=a;
        }
        System.out.println("Sonuç:"+sonuc);
    }
}
