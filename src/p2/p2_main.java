//mschro67

package p2;

import java.util.Arrays;

public class p2_main{
    public static boolean pairwiseDifferent(int[] someNumbers){
        boolean result=true;
        for (int x=0;x<someNumbers.length;x++){
            int times=0;
            for (int y=0;y<someNumbers.length;y++){
                if (someNumbers[x]==someNumbers[y]){times++;};
            }
            if (times>1){
                return false;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] someNumbers={1,2,3,4,4};
        System.out.println("someNumbers: "+Arrays.toString(someNumbers)+"\npairwiseDifferent: "+pairwiseDifferent(someNumbers));
    }
}
