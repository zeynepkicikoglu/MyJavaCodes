import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args){
        double armut,elma,domates,muz,patlıcan,tutar;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Meyveler ve KG Fiyatları\n" +
                    "\n" +
                    "        Armut : 2,14 TL\n" +
                    "        Elma : 3,67 TL\n" +
                    "        Domates : 1,11 TL\n" +
                    "        Muz: 0,95 TL\n" +
                    "        Patlıcan : 5,00 TL");
            System.out.println("Armuttan kaç kg aldınız:");
            armut=input.nextDouble();
            System.out.println("Elmadan kaç kg aldınız:");
            elma=input.nextDouble();
            System.out.println("Domatesten kaç kg aldınız:");
            domates=input.nextDouble();
            System.out.println("Muzdan kaç kg aldınız:");
            muz=input.nextDouble();
            System.out.println("Patlıcandan kaç kg aldınız:");
            patlıcan=input.nextDouble();
        }
        tutar = (( armut * 2.14 )+( elma * 3.67 )+( domates * 1.11 ) + ( muz * 0.95 )+ (patlıcan * 5.00) );
        System.out.println("Ödemeniz gereken tutar:" + tutar + "TL'dir.");

    }
}
