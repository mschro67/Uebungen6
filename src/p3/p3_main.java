//by mschro67

package p3;

import java.util.Arrays;

public class p3_main{
    public static int methode(int[] a) {
        int[] big={Integer.valueOf(a[0]),Integer.valueOf(a[0])};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i]) {
		    big[1] = Integer.valueOf(big[0]);
                    big[0] = Integer.valueOf(Integer.valueOf(a[j]));
                }
            }
        }
        return big[1];
    }
    public static void main(String[] args){
        int[] a={1,2,3,4};
        System.out.println("a: "+Arrays.toString(a)+"\nmethode: "+methode(a));
    }
}
