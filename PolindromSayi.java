public class PolindromSayi {
    static boolean isPalindrom(int number){
        int temp=number, reverseNumber=0,lastnumber;
        while(temp!=0){
            lastnumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastnumber;
            temp/=10;
        }
        if(number==reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(9889));
    }
}
