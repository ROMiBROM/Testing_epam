package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currValue = scnr.nextInt();
        int sum = currValue;
        int number = 1;
        while (true) {
            currValue = scnr.nextInt();
            if (currValue == 0) break;
            sum += currValue;
            ++number;
        }
        System.out.println(Math.round(sum/number));
    }
}