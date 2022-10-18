public class DopingMain {
    public static void main(String[] args){
        TopOfListDoping t1=new TopOfListDoping(30);
        double[] taxes={3.2,2.3};
        UptodateDoping u1=new UptodateDoping(20, taxes);
        
        System.out.println(t1.calculate());
        System.out.println(u1.calculate());
        

    }
}
