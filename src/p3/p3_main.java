//by mschro67

package p3;

import java.util.Arrays;

public class p3_main{
    public static int methode(int[] a) {
        int max=-1;
        int top2=-1;
        int k = a.length-1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (a[j] > a[i]){
                    top2=max;
                    max=a[j];
                }
            }
        }
        return top2;
    }
    public static void main(String[] args){
        int[] a={1,2,5,4,3};
        System.out.println("a: "+Arrays.toString(a)+"\nmethode: "+methode(a));
    }
}
