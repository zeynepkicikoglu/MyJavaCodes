public class Static {
    public String name;
    public static int counter=0;

    static{
        int random=(int)(Math.random()*10);
        System.out.println("Random sayı:" + random);
        counter=random;
        System.out.println(counter);
    }
    public Static(String name){
        this.name=name;
        counter++;
        System.out.println("bura calıstı");
    }
}
