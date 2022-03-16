package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите x, модуль которого меньше 1");
        double x = in.nextDouble();
        while (x <=-1 || x >= 1){
            System.out.println("Внимательнее читайте условие, введите x ещё раз");
            x = in.nextDouble();
        }
        System.out.println("Введите n больше -1");
        int n = in.nextInt();
        while (n <0){
            System.out.println("Внимательнее читайте условие, введите n ещё раз");
            n = in.nextInt();
        }
        double result = 0;
        for (int i=0; i<n+1; i++){
            result += Math.pow(x, 2*n+1)/(2*n+1);
        }
        System.out.print(result*2);
    }
}