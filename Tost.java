public class Tost {
    int sayi ;
    String malzeme ;
    public Tost() {
        this(5);
// this(5,"sucuklu"); !Hata!-iki this kullanılamaz
        System.out.println("parametresiz yapilandirici");
    }
    public Tost(int sayi) {
        this(sayi,"Sucuklu");
        this.sayi = sayi ;
        System.out.println("Tost(int sayi) " );
    }
    public Tost(int sayi ,String malzeme) {
        this.sayi = sayi ;
        this.malzeme = malzeme ;
        System.out.println("Tost(int sayi ,String malzeme) " );
    }
    public void siparisGoster() {
// this(5,"Kasarli"); !Hata!-sadece yapılandırıcılarda kullanılır
        System.out.println("Tost sayisi="+sayi+ "malzeme =" + malzeme );
    }
    public static void main(String[] args) {
        Tost t = new Tost();
        t.siparisGoster();
    }
}