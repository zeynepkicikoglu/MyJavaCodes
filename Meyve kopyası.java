public class Meyve extends Yiyecek {
    public Meyve(String isim,String renk){
        super(isim,renk, "");
        super.setIsim(isim);
        super.setRenk(renk);
        super.setYetistigiyer("ağaç");
    }

    @Override
    public String YiyecekTuru(){
        return "meyve";
    }
}
