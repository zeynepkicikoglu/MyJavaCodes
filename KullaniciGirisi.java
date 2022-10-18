
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args){
        String username,password,secim,newpassword;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Kullanıcı adınız:");
            username=input.nextLine();
            System.out.print("Şifreniz:");
            password=input.nextLine();

            if(username.equals("patika") && password.equals("java123")){
                System.out.println("Giriş başarılı.");
            }
            else{
                    System.out.println("Girdiğiniz şifre hatalı. Şifrenizi sıfırlamak ister misiniz?\nEvet\\Hayır\nSeçimiz:");
                    secim=input.nextLine();
                    if(secim.equals("Evet") || secim.equals("evet")){
                        System.out.println("UYARI:Şifreniz eski şifrenizden farklı olmalı!\nYeni şifrenizi yazın:");
                        newpassword = input.nextLine();
                        if(newpassword.equals("java123")){
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }
                        else System.out.println("Şifre başarıyla oluşturuldu.");

                    }
                    else System.out.println("Şifre değişimi reddedildi.");
            }
        }
    }
}
