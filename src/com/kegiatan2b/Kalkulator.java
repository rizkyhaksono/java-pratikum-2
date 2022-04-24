package com.kegiatan2b;

import java.util.Scanner;

public class Kalkulator {
    protected int diagonal1, diagonal2, sisi, keliling, luas;
    
    Scanner input = new Scanner(System.in);

    public void setDiagonal1() {
        System.out.print("Masukkan Nilai Diagonal 1 : ");
        int nilai = input.nextInt();
        this.diagonal1 = nilai;
    }

    public void setDiagonal2() {
        System.out.print("Masukkan Nilai Diagonal 2 : ");
        int nilai = input.nextInt();
        this.diagonal2 = nilai;
    }

    public void setSisi(){
        System.out.print("Masukkan Nilai Sisi\t  : ");
        int nilai = input.nextInt();
        this.sisi = nilai;
    }

    public int keliling() {
        return this.keliling = 4 * sisi;
    }

    public int luas() {
        return this.luas = (diagonal1 * diagonal2) / 2;
    }

    public int getDiagonal1() {
        return this.diagonal1;
    }

    public int getDiagonal2() {
        return this.diagonal2;
    }

    public void InputMenu() {
        System.out.println("\nMenu : \n1. Keliling\n2. Luas");
        System.out.print("\nMasukkan Menu\t: ");
        int nilai = input.nextInt();
        switch(nilai) {
            case 1:
                System.out.println("Keliling\t: " + keliling());
                break;
            case 2:
                System.out.println("Luas\t\t: " + luas());
                break;
            default:
                System.out.println("Menu Tidak Tersedia!");
                InputMenu();
                break;
        }
    }
}
