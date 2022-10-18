public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double beginner;


    public Fighter(String name, int damage, int health, int weight, double dodge, double beginner) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge>=0 && dodge<=100){
            this.dodge=dodge;
        }
        else{
            this.dodge=0;
        }
        this.beginner=beginner;
    }

    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }

    public boolean WhoStart() {
        double randomValue = Math.random() * 50;
        return randomValue <= this.beginner;
    }


}
