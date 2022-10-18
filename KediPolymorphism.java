public class KediPolymorphism extends HayvanPolymorphism {
    public KediPolymorphism(String name){
        super(name);
    }
    @Override
    public String speak(){
        return this.getName() + " Miyavlıyor...";
    }
}
