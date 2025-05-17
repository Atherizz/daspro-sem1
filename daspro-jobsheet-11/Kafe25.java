import java.util.Scanner;

public class Kafe25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu("Andi", true, "DISKON50");
       
        System.out.print("Masukkan jumlah menu yang akan dipesan : ");
        int jumlahPesanan = sc.nextInt();

        int [] pilihanMenu = new int[jumlahPesanan];
        int [] banyakItem = new int[jumlahPesanan];
        
        for (int i = 0; i < pilihanMenu.length; i++) {
            System.out.print("\nMasukkan nomor menu ke " + (i+1) +  " yang ingin Anda pesan: ");
            pilihanMenu[i] = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan : ");
            banyakItem[i] = sc.nextInt();
        }

        System.out.print("Masukkan kode promo : ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan anda : Rp. " + totalHarga);
    }

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
            if (kodePromo == "DISKON50") {
                System.out.println("diskon 50%");
            } else if (kodePromo == "DISKON30") {
                System.out.println("diskon 30%");
            } else {
                System.out.println("KODE INVALID!");
            }
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 10,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }

    public static int hitungTotalHarga (int[] pilihanMenu, int [] banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = 0;

        for (int i = 0; i < pilihanMenu.length; i++) {
            hargaTotal += hargaItems[pilihanMenu[i] -1] * banyakItem[i];
        }

        if (kodePromo.equals("DISKON50")) {
            hargaTotal -= (hargaTotal * 50/100);
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal -= (hargaTotal * 30/100);
        } else {
            System.out.println("KODE INVALID!");
        }
        return hargaTotal;
    }
}