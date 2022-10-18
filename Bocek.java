
class Bocek {
    int a = 10;
    int b;
    Bocek() {
        ekranaBas("a = " + a + ", b = " + b);
        b = 17;
    }
    static int x1 = ekranaBas("static Bocek.x1 ilk deger verildi");
    static int ekranaBas(String s) {
        System.out.println(s);
        return 18;
    }
}

