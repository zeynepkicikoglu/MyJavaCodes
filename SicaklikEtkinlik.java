
import java.util.Scanner;
public class SicaklikEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hava kaç derece:");
            sicaklik=input.nextInt();
        }
        if(sicaklik<5)
            System.out.println("Kayak yapabilirsin.");
        else if(sicaklik>=5 && sicaklik<10)
            System.out.println("Sinemaya gidebilirsin.");
        else if(sicaklik>=10 && sicaklik<15)
            System.out.println("Piknik veya sinema yapabilirsin.");
        else if(sicaklik>=15 && sicaklik<=25)
            System.out.println("Piknik yapabilirsin.");
        else if(sicaklik>25)
            System.out.println("Yüzebilirsin.");
    }
}

