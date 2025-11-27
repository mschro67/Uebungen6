//mschro67

package p3;

import java.util.Arrays;

public class p3_main{
    public static int methode(int[] a) {
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i]) {
                    max = a[j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4};
        System.out.println("a: "+Arrays.toString(a)+"\nmax: "+methode(a));
    }
}
