public class Polymorphism {
    public static void konustur(Object object){

        if (object instanceof KopekPolymorphism){
            KopekPolymorphism kopekTest = (KopekPolymorphism)object;
            System.out.println(kopekTest.speak());
        }
        else if(object instanceof KediPolymorphism){
            KediPolymorphism kediTest = (KediPolymorphism)object;
            System.out.println(kediTest.speak());
        }
        else if (object instanceof AtPolymorphism){
            AtPolymorphism atTest = (AtPolymorphism)object;
            System.out.println(atTest.speak());
        }
        else if (object instanceof HayvanPolymorphism){
            HayvanPolymorphism hayvanTest = (HayvanPolymorphism)object;
            System.out.println(hayvanTest.speak());
        }
    }

    public static void main(String[] args){

        // Temel Gösterim
        KediPolymorphism kedi = new KediPolymorphism("Nasip");

        if (kedi instanceof KediPolymorphism){
            System.out.println("Bu nesne Kedi sınıfından");
        }

        if (kedi instanceof HayvanPolymorphism){
            System.out.println("Bu nesne Hayvan sınıfından");
        }

        //Fonksiyon ile gösterim

        KediPolymorphism kedii = new KediPolymorphism("Nasip");
        KopekPolymorphism kopek = new KopekPolymorphism("Zizu");
        AtPolymorphism at = new AtPolymorphism("BoldPilot");
        HayvanPolymorphism hayvan = new HayvanPolymorphism("Turunç");

        konustur(kedii);
        konustur(kopek);
        konustur(at);
        konustur(hayvan);
    }

    
}
