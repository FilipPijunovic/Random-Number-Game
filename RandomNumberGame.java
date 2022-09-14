package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double n = Math.round(Math.random() * 1000);
        System.out.println("Raten Sie eine Nummer zwischen 0 und 1000");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        while (x!=n) {
            if (x<n) {
                System.out.println("Mehr");
            }
            else if (x>n) {
                    System.out.println("Kleiner");
            }
            x = scanner.nextDouble();
        }
    }
}
