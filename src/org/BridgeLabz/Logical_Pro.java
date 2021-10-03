package org.BridgeLabz;
import java.util.Scanner;
public class Logical_Pro {
    public static void main(String[] args) {
     int n,res;
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            res = n%10;
            System.out.println("Reverse nuber" +res);
            n  = n/10;
        }

    }
}
