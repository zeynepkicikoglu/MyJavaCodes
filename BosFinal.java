class Kalem {
}
public class BosFinal {
    final int a = 0;
    final int b; // Bos final
    final Kalem k; // Blank final nesne alanı
    // Bos final alanlar ilk değerlerini
// içerisinde alırlar
    BosFinal() {
        k = new Kalem();
        b = 1; // bos final alanına ilk değeri ver
    }
    BosFinal(int x) {
        b = x; // bos final alanına ilk değeri ver
        k = new Kalem();
    }
    public static void main(String[] args) {
        
    }
}

