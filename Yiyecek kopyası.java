public abstract class Yiyecek {
    private String isim;
    private String renk;
    private String yetistigiyer;

    public Yiyecek(String isim,String renk,String yetistigiyer){
        this.isim=isim;
        this.renk=renk;
        this.yetistigiyer=yetistigiyer;
    }
    public void setIsim(String isim){
        this.isim=isim;
    }
    public void setRenk(String renk){
        this.renk=renk;
    }
    public void setYetistigiyer(String yetistigiyer){
        this.yetistigiyer=yetistigiyer;
    }
    public String getIsim(){
        return this.isim;
    }
    public String getRenk(){
        return this.renk;
    }
    public String getYetistigiyer(){
        return this.yetistigiyer;
    }
    public String YiyecekTuru(){
        return "belirsiz";
    }
}
