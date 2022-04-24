package com.kegiatan2b;

import java.util.Scanner;

public class Terstruktur {
    public static void main(String[] args){
        int nilaiDiagonal1, nilaiDiagonal2, inputMenu, sisi, hasil;

        Scanner inputData = new Scanner(System.in);

        System.out.println("Kalkulator Belah Ketupat");
        System.out.print("\n1. Menghitung Keliling \n2. Menghitung Luas \n\nPilih     : ");
        inputMenu = inputData.nextInt();

        switch (inputMenu) {
            case 1 -> {
                System.out.println("\nMenghitung Keliling");
                System.out.print("Nilai Sisi\t: ");
                sisi = inputData.nextInt();

                hasil = sisi * 4;
                System.out.printf("Hasil\t\t: %d", hasil);
            }
            case 2 -> {
                System.out.println("\nMenghitung Luas");
                System.out.print("Nilai Diagonal 1\t: ");
                nilaiDiagonal1 = inputData.nextInt();

                System.out.print("Nilai Diagonal 2\t: ");
                nilaiDiagonal2 = inputData.nextInt();

                hasil = (nilaiDiagonal1 * nilaiDiagonal2) / 2;
                System.out.printf("Hasil\t\t\t: %d", hasil);
            }
            default -> System.out.println("Tidak ada pilihan!");
        }
    }
}
