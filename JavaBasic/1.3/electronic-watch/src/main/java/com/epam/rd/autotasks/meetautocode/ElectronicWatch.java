package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int hours = n / 60 / 60 %24;
        int minutes = n / 60 % 60;
        int seconds = n % 60;
        System.out.println(hours + ":" + str(minutes) + ":" + str(seconds));
    }

    private static String str(int n) {
        return n < 10 ? "0" + n : "" + n;
    }
    }
