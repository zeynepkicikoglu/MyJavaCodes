public class DizilerGiris {
    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }
        return reverse;
    }

    static void printArray(int[] list){
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args){

        int[] list={10,20,30,40,50,60,70,80,90,100};
        //int[] newListe=reverse(list);
        //printArray(newListe);
        printArray(reverse(list));
    }

    // BURADAN AŞAĞISI OKULDA YAPTIKLARIMDIR....
    /* String[] arr=new String[4];
        arr = new String[]{"BMW","Volvo","Fordo","Mazda"};
        System.out.println(arr[0] + " " + arr[1] );
        System.out.println(arr.length);

        for(String i:arr){
            System.out.println(i);
        }
*/
        /*Scanner input=new Scanner(System.in);
        String[] yenidizi= new String[3];
        System.out.println("Bir değer giriniz:");


        for(int i=0;i< yenidizi.length;i++){
            yenidizi[i]=input.nextLine();
            for(int j=0;j< yenidizi.length;j++){
                System.out.println(yenidizi[j]);

            }
        } */

        /*
        for(int i=0;i< yenidizi.length;i++) {
            yenidizi[i] = input.nextLine();
        }
        for(int j=0;j<yenidizi.length;j++){
            System.out.println(yenidizi[j]);

        }

        */
    //DecimalFormat df2=new DecimalFormat(".##.");
        /*int[] numbers={1,43,56,78,90,-4,-3,-1,211};
        int toplam=0;
        double ort;

        for(int i:numbers){
            toplam+=i;
        }
        System.out.println("Sayıların toplamı:"+toplam);
        ort=((double)toplam/ numbers.length);
        System.out.println("Ortalaması:"+ ort);*/

    /*int[][] a={
            {1,2,3},
            {1,2,3,4},
            {1},
    };

        System.out.println(a[0][0]);
        System.out.println(a[1].length);
        System.out.println(a[2].length); */

    /*  int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        int sum = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;
        }
        for(int a=0;a< arr.length;a++){
            for(int b=0;b<=a;b++){
                System.out.print(arr[a][b]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i + 1; ++j)
                sum += arr[i][j];
        }
        System.out.println("\n"+sum);
*/


}

