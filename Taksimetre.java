import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){
        int km;
        double perKm=2.20,total=10;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Mesafeyi KM cinsinden giriniz:");

            km=input.nextInt();
        }
        total+=(km * perKm);
        total=(total<20) ? 20 : total;
        System.out.println("Tutar:" +total);

    }
}
