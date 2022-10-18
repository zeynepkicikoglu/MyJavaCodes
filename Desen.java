import java.util.Scanner;
public class Desen {
    static int desen(int a,int b){
        System.out.print(b+" ");
        b-=5;

        if(b==0 || b<0){
            while(b!=a){
                System.out.print(b+" ");
                b+=5;
            }
            return a;
        }
        return desen(a,b);
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("N sayısı: ");
            int sayi=input.nextInt();
            System.out.print("Çıktısı: ");
            System.out.print(desen(sayi,sayi));
        }
    }
}
