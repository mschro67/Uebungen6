//by mschro67

package h2;

import java.util.Arrays;

public class h2_main{
    public static boolean compareArrays(int[] a,int[] b){
        boolean result=true;
        if (a.length==b.length) {
            for (int x = 0; x<a.length;x++){
                if (Integer.valueOf(a[x])!=Integer.valueOf(b[x])){
                    return false;
                }
            }
        }else{
            result=false;
        }
        return result;
    }
    public static void main(String[] args){
        int[] a={0,1,2,3},b={0,1,2,3};
        System.out.println("a: "+Arrays.toString(a)+"\nb: "+Arrays.toString(b)+"\ncomparearrays: "+compareArrays(a,b));
    }
}
