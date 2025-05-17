package Praktikum05;

import java.util.Scanner;

public class PemilihanHariDenganIf25 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int angka;
        System.out.print("masukkan angka : ");
        angka = sc.nextInt();

        if (angka > 0 && angka <= 5) {
            System.out.println("Weekday");
        } else if (angka > 5 && angka <= 7){
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

    }
    
}
