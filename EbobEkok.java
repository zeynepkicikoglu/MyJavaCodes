import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args){
        int n1,n2;
        int ebob=1,ekok=1;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Birinci sayıyı giriniz:");
            n1= input.nextInt();
            System.out.println("İkinci sayıyı giriniz:");
            n2= input.nextInt();
        }

        int i=1;
        while(i<=n1){
            if(n1%i==0 && n2%i==0){
                ebob=i;}
            i++;}
        System.out.println("Ebob:"+ebob);
        int k=n1;
        while(k<=n1*n2){
            if(k%n1==0 && k%n2==0){
                ekok=k;
                break;}
            k++;}
        System.out.println("Ekok:"+ekok);
    }
}
