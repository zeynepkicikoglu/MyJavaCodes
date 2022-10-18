public class AtPolymorphism extends HayvanPolymorphism {
    public AtPolymorphism(String name){
        super(name);
    }
    @Override
    public String speak(){
        return this.getName() + " Kişniyor...";
    }
}
