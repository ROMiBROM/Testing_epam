package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bill=scanner.nextInt();
        int numGuests=scanner.nextInt();
        if(numGuests<=0)
        {
            System.out.println("Number of friends cannot be negative or zero");

        }
        else if(bill<0)
        {
            System.out.println("Bill total amount cannot be negative");
        }
        else {
            int cash = bill / 10;
            System.out.println((bill + cash) / numGuests);
        }
    }
}
