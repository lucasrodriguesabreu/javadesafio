package br.com.panvel.generics;

import java.util.Scanner;

public class Generics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("Quantos valores? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("O primeiro número digitado foi: " + ps.first());
        sc.close();
    }
}