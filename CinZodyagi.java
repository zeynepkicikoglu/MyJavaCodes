import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args){
        int yil,sonuc;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Doğum yılınızı giriniz:");
            yil=input.nextInt();
        }
        sonuc=(yil%12);
        if(sonuc==0)
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        else if(sonuc==1)
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        else if(sonuc==2)
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        else if(sonuc==3)
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        else if(sonuc==4)
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        else if(sonuc==5)
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        else if(sonuc==6)
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        else if(sonuc==7)
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        else if(sonuc==8)
            System.out.println("Çin Zodyağı Burcunuz: Ejdarha");
        else if(sonuc==9)
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        else if(sonuc==10)
            System.out.println("Çin Zodyağı Burcunuz: At");
        else if(sonuc==11)
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        else
            System.out.println("Hatalı sonuç");
    }
}
