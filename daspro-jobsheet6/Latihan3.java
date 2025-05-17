import java.util.Scanner;

public class Latihan3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String merk, kategori;
        int ukuran;
        int harga = 0;

        System.out.print("Masukkan merk sepatu: ");
        merk = sc.nextLine();

        System.out.print("Masukkan kategori sepatu: ");
        kategori = sc.nextLine();

        System.out.print("Masukkan ukuran sepatu : ");
        ukuran = sc.nextInt();
        
        if (merk.equalsIgnoreCase("specs")) {
            if (kategori.equalsIgnoreCase("slip on")) {
            if (ukuran >= 36) {
                if (ukuran <= 40) {
                    harga = 800000;
                    System.out.println("harga : " + harga);
                } else {
                    System.out.println("ukuran tidak ada");
                }
            } 
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                        System.out.println("harga : " + harga);
                    } else {
                        System.out.println("ukuran tidak ada");
                    }
                } 
            } else {
                System.out.println("kategori tidak ditemukan");
            } 
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                        System.out.println("harga : " + harga);
                    } else {
                        System.out.println("ukuran tidak ada");
                    }
                } 
                } else if (kategori.equalsIgnoreCase("man")) {
                    if (ukuran >= 41) {
                        if (ukuran <= 44) {
                            harga = 1800000;
                            System.out.println("harga : " + harga);
                        } else {
                            System.out.println("ukuran tidak ada");
                        }
                    } 
                } else {
                    System.out.println("kategori tidak ditemukan");
                } 
        } else if (merk.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                        System.out.println("harga : " + harga);
                    } else {
                        System.out.println("ukuran tidak ada");
                    }
                } 
                } else if (kategori.equalsIgnoreCase("adult")) {
                    if (ukuran >= 40) {
                        if (ukuran <= 44) {
                            harga = 1500000;
                            System.out.println("harga : " + harga);
                        } else {
                            System.out.println("ukuran tidak ada");
                        }
                    } 
                } else {
                    System.out.println("kategori tidak ditemukan");
                } 
        } 
            
        }

    }



