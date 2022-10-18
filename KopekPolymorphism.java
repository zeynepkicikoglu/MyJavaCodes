public class KopekPolymorphism extends HayvanPolymorphism {
    public KopekPolymorphism(String name){
        super(name);
    }
    @Override
    public String speak(){
        return this.getName() + " Havlıyor..";
    }
    
}
