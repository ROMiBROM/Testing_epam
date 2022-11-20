package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        int possion=0;
        int day=0;
        if(b>=a && a<h )
        {
            System.out.println("Impossible");
        }
        else {
            if(a>=h)
            {
                day=1;
                System.out.println(day);
            }
            else {
                while (possion < h) {
                    possion += a;
                    ++day;
                    if(possion<h) {
                        possion -= b;
                    }
                }
                System.out.println(day);
            }
        }

    }
}
