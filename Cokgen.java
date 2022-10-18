class Cokgen {
    public void alan() {
    System.out.println("Cokgen alani...");
    }
    }
    class Kare extends Cokgen {
    public void alan() {
    int alan, kenar=5;
    alan=kenar*kenar;
    System.out.println("Kare alani = " + alan);
    }
    }
    class Dikdortgen extends Cokgen {
    public void alan() {
    int alan, kenar1=5, kenar2=3;
    alan=kenar1*kenar2;
    System.out.println("Dikdortgen alani = " + alan);
    }
    }
    class Main {
    public static void main(String[] args) {
    Kare k1 = new Kare();
    k1.alan();
    Dikdortgen d1 = new Dikdortgen();
    d1.alan();
    }
}