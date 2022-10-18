import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args){
        int a,b,c;
        double u,alan;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("1. Kenar Uzunluğu:\n");
            a=input.nextInt();
            System.out.print("2. Kenar Uzunluğu:\n");
            b=input.nextInt();
            System.out.print("3. Kenar Uzunluğu:\n");
            c=input.nextInt();
        }
        u=(a+b+c) / 2;
        alan =Math.sqrt( u * (u - a)* (u - a) * (u - c));
        System.out.print("Üçgenin Alanı:" + alan);
    }
}
