public class AsalSayiBulma {
    public static void main(String[] args){
        int i=3;
        System.out.println("2");

        while(i<=100){
            for(int j=2;j<i;j++){
                if(i%j==0)
                    break;
                else if(i%j!=0) {
                    if (j == i - 1)
                        System.out.println(i);
                    else
                        continue;
                }
            }
            i++;
        }
    }
}
