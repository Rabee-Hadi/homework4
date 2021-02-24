package Smnar4;

import java.util.*;

public class Lab4 {
    static Integer myarry1[]={11,12,33,54,5,76,7,88};
    static Double myarry2[]={1.077,8.099,7.0,4.9,57.54,66.0090,};
public static <W>void reverse(W arr[]){
    int n =arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            W ss = arr[i];
            arr[i]= arr[n];
            arr[n]= ss;
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static <B>void merig(B a[],B b[]){
        ArrayList<B> m = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            m.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            m.add(b[i]);
        }
        System.out.println(m);    
    } 
    public static void main(String[] args) {
        reverse(myarry1);
        merig(myarry1, myarry2);
    }
    
}
