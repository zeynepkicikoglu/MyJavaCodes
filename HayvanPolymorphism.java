public class HayvanPolymorphism {
    private String name;

    public HayvanPolymorphism(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String speak(){
        return this.name + " Hayvan konuşuyor...";
    }
}
