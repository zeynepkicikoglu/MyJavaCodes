import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int eleman, sayi1 = 0, sayi2 = 1, sayi3 = 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Fibonacci serisinin eleman sayısını giriniz:");
            eleman = input.nextInt();
        }
        if (eleman == 1)
            System.out.println(sayi1);
        else {
            System.out.println(sayi1 + "\n" + sayi2);
            for (int i = 0; i < (eleman - 2); i++) {
                sayi3 = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2 = sayi3;
                System.out.println(sayi3);
            }
        }
    }
}

