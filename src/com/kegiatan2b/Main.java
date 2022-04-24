package com.kegiatan2b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setDiagonal1();
        kalkulator.setDiagonal2();
        kalkulator.setSisi();

        kalkulator.InputMenu();
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nApakah anda ingin keluar? (y/n) : ");
        String pilih = input.next();
        
        while(pilih.equals("n")) {
            kalkulator.InputMenu();
            System.out.print("\nApakah anda ingin keluar? (y/n) : ");
            pilih = input.next();
        }

        System.out.println("\nTerima Kasih!");
        
        input.close();
    }
}
