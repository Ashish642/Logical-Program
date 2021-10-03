package org.BridgeLabz;
import java.util.Scanner;
public class Logical_Pro {
    public static void main(String[] args) {
        int n, sum=0;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<n; i++){
            if(n%i==0){
                sum = sum+i;
            }
        } if(n==sum)
            System.out.println("Perfect number");

        else
            System.out.println("Number is not perfect number");

    }
}
