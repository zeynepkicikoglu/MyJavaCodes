import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args){
        int a,b;
        double c;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("1. Kenar Uzunluğu:\n");
            a=input.nextInt();
            System.out.print("2. Kenar Uzunluğu:\n");
            b=input.nextInt();
        }
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs Uzunluğu:"+c);
    }
}




