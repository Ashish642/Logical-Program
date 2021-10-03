package org.BridgeLabz;
import java.util.Scanner;
public class Logical_Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0 , y = 1, sum = 0, n;
        System.out.println("Enter the valu ");
        n = sc.nextInt();
        for( int i=0; i<=n; i++){
            System.out.println(sum);
            x = y;
            y = sum;
            sum = x+y;
        }
    }
}
