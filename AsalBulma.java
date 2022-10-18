import java.util.Scanner;
public class AsalBulma {
    static Object Isasal(int a, int b){
        b-=2;
        if(b==1 || a==2)
            return a+" sayısı ASALDIR";
        else if(a%b==0 || a==1)
            return a+" sayısı ASAL DEĞİLDİR!";

        return Isasal(a,b);
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int sayi;
            System.out.println("Bir sayı giriniz:");
            sayi=input.nextInt();

            System.out.println( Isasal(sayi,sayi) );
        }
    }
}

/* public class Main {
public static boolean asalMi(int sayi) {
    for (int i = 2 ; i < sayi;i++) {
        if (sayi % i == 0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        for (int i = 2 ; i < 100 ; i++) {
            if (asalMi(i)){
                System.out.println(i);
            }
        }
    }
} */