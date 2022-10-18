
public class ToplamaIslemi {
    public static void main(String args[]) {
        /*if (args.length < 2) {
            System.out.println("Ltf iki adet sayi giriniz");
            System.exit(-1); // uygulama sonlanacaktır
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double sonuc; // dikkat
        sonuc = Toplama.topla(a,b);
        System.out.println("Sonuc : " + sonuc );*/

        String str="123.43";
        String str2="65";
        double d=Double.parseDouble(str);
        System.out.println(d);
        System.out.println(str);
        double s=Double.valueOf(str);
        System.out.println(s);
        int i=Integer.parseInt(str2);
        System.out.println(i);

    }


}
