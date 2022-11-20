package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner Scanner = new Scanner(System.in);
        int guests = Scanner.nextInt();
        Scanner.nextLine();
        if (guests>0)
        {
            for (int i = guests; i>0; i--) {
                String name = Scanner.nextLine();
                System.out.println("Hello, "+ name);
            }
        }
        else if (guests==0){
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");}
    }
}
