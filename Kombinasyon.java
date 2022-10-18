import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n, r;
        double sonuc;
        int fak_n=1,fak_r=1,fak_nr=1;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("N değerini girin:");
            n = input.nextInt();
            System.out.println("R değerini girin:");
            r = input.nextInt();
        }
        for(int i=1;i<=n;i++)
            fak_n*=i;
        for(int j=1;j<=r;j++)
            fak_r*=j;
        for(int a=1;a<=(n-r);a++)
            fak_nr*=a;

        sonuc=fak_n/(fak_r*fak_nr);
        System.out.println("C(n,r) sonucu:"+sonuc);
    }
}
