package com.kegiatan2a;

import java.util.Scanner;

public class Konversi {
    private int monthNumber= 12, dayNumber = 30, hourNumber = 24, minuteNumber = 60, secondNumber = 60;
    private String monthString;    
    
    Scanner input = new Scanner(System.in);

    // Month
    public void setMonth(){
        System.out.print("Masukkan Bulan\t: ");
        monthNumber = input.nextInt();
        switch(monthNumber){
            case 1:
                monthString = "Januari";
                break;
            case 2:
                monthString = "Februari";
                break;
            case 3:
                monthString = "Maret";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "Mei";
                break;
            case 6:
                monthString = "Juni";
                break;
            case 7:
                monthString = "Juli";
                break;
            case 8:
                monthString = "Agustus";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "Oktober";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "Desember";
                break;
            default:
                monthString = "Bulan tidak valid";
                break;
        }
        System.out.println("Nama Bulan\t: " + monthString);
    }

    // Day
    public int getDay(){
        return this.dayNumber = dayNumber * monthNumber;
    }

    // Minute
    public int getMinutes(){
        return this.minuteNumber = minuteNumber * hourNumber;
    }

    // Hour
    public int getHour(){
        return this.hourNumber = hourNumber * dayNumber;
    }

    // Second
    public int getSecond(){
        return this.secondNumber = secondNumber * minuteNumber;
    }

    // Conversion month to day, hour, minute
    public static void main(String[] args) {
    
        Konversi konversi = new Konversi();
        konversi.setMonth();

        System.out.println("Nilai Hari\t: " + konversi.getDay() + " Hari");
        System.out.println("Nilai Jam\t: " + konversi.getHour() + " Jam");
        System.out.println("Nilai Menit\t: " + konversi.getMinutes() + " Menit");
        System.out.println("Nilai Detik\t: " + konversi.getSecond() + " Detik");
    }
}