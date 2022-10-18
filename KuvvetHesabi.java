import java.util.Scanner;
public class KuvvetHesabi {
    public static void main(String[] args) {
        int sinir;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Sınır değeri yazınız:");
            sinir=input.nextInt();
        }
        for(int i=1;i<=sinir;i*=4){
            System.out.println("4 ün kuvvetleri:" +i);
        }
        for(int j=1;j<=sinir;j*=5){
            System.out.println("5 in kuvvetleri:" +j);
        }

    }
}

