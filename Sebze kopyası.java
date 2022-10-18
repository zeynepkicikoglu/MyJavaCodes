public class Sebze extends Yiyecek {
    public Sebze(String isim,String renk) {
        super(isim,renk, "");
        super.setIsim(isim);
		super.setRenk(renk);
        super.setYetistigiyer("toprak");
	}

    @Override
    public String YiyecekTuru(){
        return "sebze";
    }
}
