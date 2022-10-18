public class YiyecekMain {
    public static void yiyecek(Object object){
        if(object instanceof Meyve){
            Meyve m1=(Meyve)object;
            System.out.println(m1.getIsim()+" bir meyvedir.");
        }
        else if(object instanceof Sebze){
            Sebze s1=(Sebze)object;
            System.out.println(s1.getIsim()+" bir sebzedir.");
        }
    }
    public static void main(String[] args){
        Sebze sebze=new Sebze("lahana", "kırmızı");
        Meyve meyve=new Meyve("elma", "yeşil");
        
        System.out.println("Sebzenin yetiştiği yer:"+sebze.getYetistigiyer());
        System.out.println("Meyvenin yetiştiği yer:"+meyve.getYetistigiyer());
        
        yiyecek(sebze);
        yiyecek(meyve);

        System.out.println(sebze.YiyecekTuru());
        System.out.println(meyve.YiyecekTuru());
    }
    
}
