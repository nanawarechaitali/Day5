package com.brideglabz;
import java.util.Scanner;

public class LargestAmongNumber {
    public static void main(String[] args) {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = s.nextInt();
        System.out.println("Enter the second number:");
        y = s.nextInt();
        System.out.println("Enter the third number:");
        z = s.nextInt();

        if (x > y && x > z)
            System.out.println(x + "is the largest number.");
        else if (y > z) {
            System.out.println(y + "is largest number");
        } else {
            System.out.println(z + " is largest number");
        }

    }

}

