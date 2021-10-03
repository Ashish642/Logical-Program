package org.BridgeLabz;
import java.util.Scanner;
public class Logical_Pro {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Tye 'r' to start: ");
        long start = System.currentTimeMillis();
        sc.nextLine();
        System.out.println("Type ;s; to stop: ");
        sc.nextLine();
        long stop = System.currentTimeMillis();
        long ElapsedTime = (stop - start ) / 1000;
        System.out.println("Elapsed Time was : " +ElapsedTime+ "Second");



    }
}
