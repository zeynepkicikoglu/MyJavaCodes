
import java.util.*;
public class DiziSiralama {
    public static void ekranaBas(double[] d){
        for(int i=0;i<d.length;i++){
            System.out.println("d["+i+"]="+d[i]);
        }
    }
    public static void main(String[] args){
        double d[]=new double[9];
        d[0]=2.45;
        d[1]=3.45;
        d[2]=4.78;
        d[3]=1.45;
        d[4]=15.12;
        d[5]=1;
        d[6]=9;
        d[7]=15.32;
        d[8]=78.17;
        System.out.println("karisik");
        ekranaBas(d);
        Arrays.sort(d);
        System.out.println("siralanmıs");
        ekranaBas(d);


    }
}
