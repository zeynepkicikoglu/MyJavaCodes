import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args){
        int basamak;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Basamak sayısı:");
            basamak=input.nextInt();
        }
        for(int i=basamak;i>=1;i--){
            for(int k=1;k+i<=basamak;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
