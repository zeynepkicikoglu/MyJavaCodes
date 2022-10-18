public class Yarisma {
static int tavsanKare=0,kaplumbagaKare=0;

public static void PistDurumu(int tavsan,int kaplumbaga){
    for(int i=0;i<=20;i++){
        if(tavsan==kaplumbaga && i==tavsan){
            System.out.print("OUCH");
        }
        else if(i==tavsan){
            System.out.print("T");
        }
        else if(i==kaplumbaga){
            System.out.print("K");
        }
        if(i==20){
            break;
        }
        System.out.print("- ");
    }
}

public static boolean KimKazandi(int tavsan,int kaplumbaga){
    if(tavsan>=20){
        tavsanKare=20;
        System.out.println("\n"+"Tavşanın karesi:"+tavsanKare +"\n"+"Kaplumbağanın karesi:"+kaplumbagaKare+"\n"+"Tavsan kazandı, yuh!");
        return true;
    }
    else if(kaplumbaga>=20){
        kaplumbagaKare=20;
        System.out.println("\n"+"Tavşanın karesi:"+tavsanKare +"\n"+"Kaplumbağanın karesi:"+kaplumbagaKare+"\n"+"Kaplumbağa kazandı oley");
        return true;
    }
    else if(tavsan>=20 && kaplumbaga>=20){
        tavsanKare=20;
        kaplumbagaKare=20;
        System.out.println("\n"+"Tavşanın karesi:"+tavsanKare +"\n"+"Kaplumbağanın karesi:"+kaplumbagaKare+"\n"+"Berabere");
        return true;
    }
    System.out.print("\n"+"Tavşanın karesi:"+tavsanKare +"\n"+"Kaplumbağanın karesi:"+kaplumbagaKare+"\n"+"Yarışma devam ediyor..."+"\n");
    return false;
}

public static void randomValue(){

    int TavsanrandomValue = (int)(Math.random() * 100);
    int KaplumrandomValue=(int)(Math.random()*100);
    KaplumbagaSayiDegeri(KaplumrandomValue);
    TavsanSayiDegeri(TavsanrandomValue);
}
public static int KaplumbagaSayiDegeri(int k){
    if(k>=0 && k<=49){ //Hızlı Yürüyüş
        kaplumbagaKare+=3;
    }
    else if(k>49 && k<=69){ //Kayma
        kaplumbagaKare-=6;
    }
    else if(k>69 && k<=99){//Yavaş Yürüyüş
        kaplumbagaKare+=1;
    }
    if(kaplumbagaKare<0){
        kaplumbagaKare=0;
    }
    return kaplumbagaKare;
}
public static int TavsanSayiDegeri(int t){
    if(t>19 && t<=39){//büyük sıçrama
        tavsanKare+=9;
    }
    else if(t>39 && t<=49){//büyük kayma
        tavsanKare-=12;
    }
    else if(t>49 && t<=79){//küçük sıçrama
        tavsanKare+=1;
    }
    else if(t>79 && t<=99){//küçük kayma
        tavsanKare-=2;
    }
    if(tavsanKare<0){
        tavsanKare=0;
    }
    return tavsanKare;
}
public static void main(String[] args) {
    System.out.println("Yarışma başlıyor...");
    while(true){
        randomValue();
        PistDurumu(tavsanKare, kaplumbagaKare);
        
        if (KimKazandi(tavsanKare, kaplumbagaKare)){
            break;
        }
    }
}
}