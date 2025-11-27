//by mschro67

package h1;

import java.util.Arrays;

public class h1_main{
    public static boolean isMirrorArray(int[] a, int[] b){
        boolean result=true;
        if (a.length==b.length){
            for (int x=0;x<a.length;x++){
                if (a[x]!=b[b.length-1-x]){
                    return false;
                }
            }
        }else{
            result=false;
        }
        return result;
    }
    public static void main(String[] args){
        int[] a={0,1,2,3},b={3,2,1,0};
        System.out.println("a: "+Arrays.toString(a)+"\nb: "+Arrays.toString(b)+"\nisMirrorArray: "+isMirrorArray(a,b));
    }
}
