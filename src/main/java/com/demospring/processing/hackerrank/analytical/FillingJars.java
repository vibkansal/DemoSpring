package com.demospring.processing.hackerrank.analytical;

import java.util.Scanner;

public class FillingJars {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        long N = reader.nextInt();
        long M = reader.nextInt();
        long total = 0;
        for(int i=0;i<M;i++){
            long a = reader.nextInt();
            long b = reader.nextInt();
            long k = reader.nextInt();
            total = total + (b-a+1)*k;
        }
        double tmp = Math.floor(total/N);
        long avg = (long) tmp;
        System.out.println(avg);
    }
}