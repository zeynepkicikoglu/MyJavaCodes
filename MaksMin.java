import java.util.Scanner;
public class MaksMin {
    public static void main(String[] args){
        int adet;
        int maks = 0,min=0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Kaç tane sayı giriceksiniz:");
            adet=input.nextInt();
            int k=1;
            while(adet>0){
                System.out.println(k+". sayıyı giriniz:");
                int number= input.nextInt();
                adet--;
                k++;
                if(number>maks)
                    maks=number;
                else if(number<min)
                    min=number;
            }
        }

        System.out.println("Maks:" +maks+"\nMin:"+min);
    }
}
