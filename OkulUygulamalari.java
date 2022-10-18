//public class OkulUygulamalari {
        /*public static void main(String[] args) {
// create null, empty, and regular strings
            String str1 = null;
            String str2 = "";
            String str3 = " ";
// null or empty
            System.out.println("str1 is" + isNullEmpty(str1));
// null or empty
            System.out.println("str2 is" + isNullEmpty(str2));
// null or empty
            System.out.println("str3 is" + isNullEmpty(str3));
        }
        // null or empty kontrol metodu
        public static String isNullEmpty(String str) {
// null kontrolü
            if (str == null) {
                return " NULL";
            }
// empty kontrolü
            else if(str.isEmpty()){
                return " EMPTY";
            }
            else {
                return " NULL nor EMPTY";
            }
        } */
public class OkulUygulamalari {
    public static void main(String[] args) {
        int satir = 2, sutun = 3;
        int[][] matris1 = {{2, 3, 4},
                            {5, 2, 3}};
        int[][] matris2 = {{-4, 5, 3},
                            {5, 6, 3}};
// Matris toplami
        int[][] toplam = new int[satir][sutun];
        for (int i = 0; i < satir ;
        i++){
            for (int j = 0; j < sutun ;
            j++){
                toplam[i][j] = matris1[i][j] + matris2[i][j];
            }
        }
// Sonuclari goster
        System.out.println( "Matrislerin Toplami: ");
        for (int i = 0; i < satir ; i++){
            for (int j = 0; j < sutun ;
            j++){
                System.out.print(toplam[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    //class Main {
   /* public static void main(String[] args) {
        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    } */


    /*int normalDegisken(int a) {
        return a * 2;
    }
    static int staticDegisken(int a) {
        return a * 2;
    }
    public static void main(String[] args) throws Exception {
        OkulUygulamalari p = new OkulUygulamalari();
        for (int x = 0; x < 10; x++) {
            System.out.println(p.normalDegisken(x));
        }
        System.out.println("\n\n");
        for(int y=0; y<5; y++){
            System.out.println(OkulUygulamalari.staticDegisken(y));
        }
    }
}*/


