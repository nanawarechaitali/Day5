package com.brideglabz;
import java.util.Scanner;

public class HarmonicNumber {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        int i=1;
        double sum=0;
        while(i<=n){
            sum = sum+(double)1/i;
            i++;
        }
        System.out.println("Nth Harmonic Number is "+sum);

    }
}
