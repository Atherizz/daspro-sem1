import java.util.Scanner;

public class Pemilihan2Percobaan225 {
    
    public static void main(String[] args) {
        
        Scanner input25 = new Scanner(System.in);

        int pilihanMenu, harga;
        String member, QRIS;
        double diskon, totalBayar;


        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihanMenu = input25.nextInt();
        input25.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input25.nextLine();
        System.out.print("Apakah menggunakan pembayaran melalui QRIS? (y/n) ? = ");
        QRIS = input25.nextLine();
        System.out.println("-----------------------------------------");

        if(member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga es teh = " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            totalBayar = harga - (harga * diskon);
            System.out.println("Pembayaran QRIS = " + QRIS);


            if (QRIS.equalsIgnoreCase("y")) {
            totalBayar -= 1000;
            System.out.println("Besar Potongan = " + 1000);
            } else {
            System.out.println("Besar Potongan = " + 0);
            }
            System.out.println("Total Bayar setelah diskon = " + totalBayar);

        } else if (member.equalsIgnoreCase("n")) {

            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga es teh = " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            totalBayar = harga;

            System.out.println("Pembayaran QRIS = " + QRIS);

            if (QRIS.equalsIgnoreCase("y")) {
                totalBayar -= 1000;
                System.out.println("Besar Potongan = " + 1000);
                } else {
                    System.out.println("Besar Potongan = " + 0);
                    }
            
            System.out.println("Total Bayar adalah : " + totalBayar);
            
         
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-----------------------------------------------");

    }

    
}
