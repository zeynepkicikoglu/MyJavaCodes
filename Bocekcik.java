public class Bocekcik extends Bocek {
    int k = ekranaBas("Bocekcik.k ilk deger verildi");
    Bocekcik() {
        ekranaBas("k = " + k);
        ekranaBas("b = " + b);
    }
    static int x2= ekranaBas("static Bocekcik.x2 ilk deger verildi");
    public static void main(String[] args) {
        ekranaBas("Bocekcik - basla..");
    }
}