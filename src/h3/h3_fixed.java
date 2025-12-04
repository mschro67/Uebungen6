//by mschro67

package h3;

import java.util.Arrays;

public class h3_fixed {
    public static boolean compareArraysVal(int[] a,int[] b){
        boolean result=true;
        if (a.length==b.length) {
            int[][] valuesA = new int[2][a.length];
            for (int x = 0; x < a.length; x++) {
                boolean z=false;
                for (int y=0; y<a.length;y++){
                    if (a[x]==valuesA[0][y]){
                        valuesA[1][y]++;
                        z=true;
                        break;
                    }
                }
                if (!z) {
                   valuesA[0][x]=a[x];
                   valuesA[1][x]++;
                }
            }
            int[][] valuesB={valuesA[0],new int[b.length]};
            for (int x = 0; x < b.length; x++) {
                boolean z=false;
                for (int y=0; y<b.length;y++){
                    if (b[x]==valuesB[0][y]){
                        valuesB[1][y]++;
                        z=true;
                        break;
                    }
                }
            }
            for (int x=0;x<a.length;x++){
                if (valuesA[1][x]!=valuesB[1][x]){
                    result=false;
                }
            }
        }else{
            result=false;
        }
        return result;
    }
    public static void main(String[] args){
        int[] a={2,3,0,1,2},b={1,0,2,3};
        System.out.println("a: "+ Arrays.toString(a)+"\nb: "+Arrays.toString(b)+"\ncomparearraysVal: "+compareArraysVal(a,b));
    }
}