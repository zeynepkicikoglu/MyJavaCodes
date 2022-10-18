class Hayvan {
    public Hayvan(String name) {
    }

    public void ses() {
    System.out.println("Hayvan sesleri");
    }
    }
    class Kedi extends Hayvan {
    public void ses() {
    System.out.println("miyav");
    }
    }
    class Ordek extends Hayvan {
    public void ses() {
    System.out.println("vak vak");
    }
    }
    class Main {
    public static void main(String[] args) {
    Hayvan hayvan1 = new Hayvan();
    Hayvan kedi1 = new Kedi();
    Hayvan ordek1 = new Ordek();
    hayvan1.ses();
    kedi1.ses();
    ordek1.ses();
    }
    }