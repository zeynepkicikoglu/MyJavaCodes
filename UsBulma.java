import java.util.Scanner;
public class UsBulma {
    static int us(int a,int b,int c){
        c*=a;
        b-=1;
        if(b==1)
            return c*a;
        return us(a,b,c);
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int kuvvet,taban;
            System.out.println("Taban değerini giriniz:");
            taban=input.nextInt();
            System.out.println("Kuvvet değerini giriniz:");
            kuvvet=input.nextInt();
            System.out.println("Sonuç:"+us(taban,kuvvet,1) );
        }
    }
}
