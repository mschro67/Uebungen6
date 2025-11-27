//by mschro67

package p1;

import java.util.Scanner;

public class p1_main{
    public static int squared(int x){
        return x*x;
    }
    public static void main(String[] args){
        System.out.print("input: ");
        Scanner s = new Scanner(System.in);

        int input = Integer.parseInt(s.nextLine());
        s.close();

        System.out.println("squared: " + squared(input));
    }
}
