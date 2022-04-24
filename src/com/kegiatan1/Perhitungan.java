package com.kegiatan1;

import java.util.Scanner;

public class Perhitungan {
    private int NilaiProgdas, NilaiKalkulus, NilaiOrkom;
    private double Hasil;

    Scanner input = new Scanner(System.in);
    
    // Method Program Dasar
    public void setNilaiProgdas(){
        System.out.print("Masukkan Nilai Progdas\t: ");
        int nilai = input.nextInt();
        this.NilaiProgdas = nilai;
    }

    public int getNilaiProgdas(){
        return this.NilaiProgdas;
    }

    // Method Kalkulus
    public void setNilaiKalkulus(){
        System.out.print("Masukkan Nilai Kalkulus\t: ");
        int nilai = input.nextInt();
        this.NilaiKalkulus = nilai;
    }

    public int getNilaiKalkulus(){
        return this.NilaiKalkulus;
    }

    // Method Orkom
    public void setNilaiOrkom(){
        System.out.print("Masukkan Nilai Orkom\t: ");
        int nilai = input.nextInt();
        this.NilaiOrkom = nilai;
    }

    public int getNilaiOrkom(){
        return this.NilaiOrkom;
    }
    
    // Rata-rata
    public void hitungRata(double orkom, double progdas, double kalkulus){
        this.Hasil = (orkom + progdas + kalkulus) / 3;
        System.out.printf("\nRata-rata\t: %.2f\n", this.Hasil);
    }
    
    // Validatasi nilai
    public void cekNilai(){
        if(this.Hasil > 70){
            System.out.println("Status\t\t: LULUS");
        }else{
            System.out.println("Status\t\t: TIDAK LULUS");
        }
    }
    
    public static void main(String[] args) {
        Perhitungan hitung = new Perhitungan();

        hitung.setNilaiProgdas();
        hitung.setNilaiKalkulus();
        hitung.setNilaiOrkom();

        System.out.println("\nNilai Anda :");
        System.out.println("Nilai Progdas\t: " + hitung.getNilaiProgdas());
        System.out.println("Nilai Kalkulus\t: " + hitung.getNilaiKalkulus());
        System.out.println("Nilai Orkom\t: " + hitung.getNilaiOrkom());

        Perhitungan nilai = new Perhitungan();
        nilai.hitungRata(hitung.getNilaiProgdas(), hitung.getNilaiKalkulus(), hitung.getNilaiOrkom());
        nilai.cekNilai();
    }
}
