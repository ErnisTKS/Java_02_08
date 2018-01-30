package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite nuvažiuotus km: ");
        float atstumas = sc.nextFloat();
        System.out.println("Iveskite sunaudota kura L: ");
        float kuras = sc.nextFloat();
        System.out.println("Vidurkis: " + ((kuras*100)/atstumas));
    }
}
