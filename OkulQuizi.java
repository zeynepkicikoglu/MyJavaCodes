
import java.util.Scanner;
public class OkulQuizi {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            Double[] sayilar=new Double[5];
            for(int i=0;i< sayilar.length;i++){
                System.out.println("Bir sayı giriniz");
                sayilar[i]=input.nextDouble();
            }
            for(int i=0;i< sayilar.length;i++){
                System.out.println(sayilar[i]);
            }
        }
    }
}
/* public static int fak(){
        Scanner input=new Scanner(System.in);
        int n,fak=1;
        System.out.println("Bir sayı giriniz:");
        n=input.nextInt();
        while(true){
            for(int i=1;i<=n;i++){
                fak*=i;
            }
            if(n<=0){
                System.out.println("Negatif değer girdiniz.");
                break;
            }
            break;
        }
        return fak;
    }*/