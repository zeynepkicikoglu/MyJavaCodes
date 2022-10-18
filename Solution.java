import java.io.*;
import java.util.*;

public class Solution {
    static {
    int B,H;
    Scanner inp=new Scanner(System.in);
    System.out.println("Please,write the breadth of the parallelogram.");
    B=inp.nextInt();
    System.out.println("Please,write the height of the parallelogram.");
    H=inp.nextInt();
    if(B>0 && H>0){
        int area=B*H;
        System.out.println("Area of parallelogram:" + area);
    }
    else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
}
}
