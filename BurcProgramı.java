import java.util.Scanner;
public class BurcProgramı {
    public static void main(String[] args) {
        int gun;
        String ay;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Doğum ayınızı yazınız:");
            ay = input.nextLine();
            System.out.println("Doğum gününüzü yazınız:");
            gun = input.nextInt();
        }

        if(ay.equals("Ocak") || ay.equals("ocak")) {
            if (gun <= 21 && gun > 0)
                System.out.println("Oğlak burcu");
            else
                System.out.println("Kova burcu");
        }
        else if(ay.equals("Şubat") || ay.equals("şubat")){
            if(gun<=19 && gun>0)
                System.out.println("Kova burcu");
            else
                System.out.println("Balık burcu");
        }
        else if(ay.equals("Mart") || ay.equals("mart")){
            if(gun<=20 && gun>0)
                System.out.println("Balık burcu");
            else
                System.out.println("Koç burcu");
        }
        else if(ay.equals("Nisan") || ay.equals("nisan")){
            if(gun<=20 && gun>0)
                System.out.println("Koç burcu");
            else
                System.out.println("Boğa burcu");
        }
        else if(ay.equals("Mayıs") || ay.equals("mayıs")){
            if(gun<=21 && gun>0)
                System.out.println("Boğa burcu");
            else
                System.out.println("İkizler burcu");
        }
        else if(ay.equals("Haziran") || ay.equals("haziran")){
            if(gun<=22 && gun>0)
                System.out.println("İkizler burcu");
            else
                System.out.println("Yengeç burcu");
        }
        else if(ay.equals("Temmuz") || ay.equals("temmuz")){
            if(gun<=22 && gun>0)
                System.out.println("Yengeç burcu");
            else
                System.out.println("Aslan burcu");
        }
        else if(ay.equals("Ağustos") || ay.equals("ağustos")){
            if(gun<=22 && gun>0)
                System.out.println("Aslan burcu");
            else
                System.out.println("Başak burcu");
        }
        else if(ay.equals("Eylül") || ay.equals("eylül")){
            if(gun<=22 && gun>0)
                System.out.println("Başak burcu");
            else
                System.out.println("Terazi burcu");
        }
        else if(ay.equals("Ekim") || ay.equals("ekim")){
            if(gun<=22 && gun>0)
                System.out.println("Terazi burcu");
            else
                System.out.println("Akrep burcu");
        }
        else if(ay.equals("Kasım") || ay.equals("kasım")){
            if(gun<=21 && gun>0)
                System.out.println("Akrep burcu");
            else
                System.out.println("Yay burcu");
        }
        else if(ay.equals("Aralık") || ay.equals("aralık")){
            if(gun<=21 && gun>0)
                System.out.println("Yay burcu");
            else
                System.out.println("Oğlak burcu");
        }
        else
            System.out.println("Geçersiz giriş");

    }
}

