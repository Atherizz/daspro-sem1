import java.util.Scanner;

public class Tugas1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 50000;
        int jumlahTiket, totalHarga;
        int i = 1;
        double hargaDiskon = 0;
        int pendapatanHarian = 0;

        System.out.println("---------------SELAMAT DATANG DI LOKET BIOSKOP---------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Masukkan jumlah tiket sebesar 0 jika ingin keluar dari program\n");

        do {
            System.out.print("Masukkan jumlah tiket pelanggan ke " + i + " :");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("nilai tidak valid, masukkan ulang jumlah tiket");
                continue;
            } else if (jumlahTiket == 0) {
                continue;
            }
            
            totalHarga = jumlahTiket * harga;
            System.out.println("total harga : " + totalHarga);

            if (jumlahTiket > 4 && jumlahTiket <= 10) {
                hargaDiskon = totalHarga - (totalHarga * 0.1);
                System.out.println("Diskon : 10%");
                System.out.println("harga setelah diskon : " + hargaDiskon);
            } else if (jumlahTiket > 10) {
                hargaDiskon = totalHarga - (0.15 * totalHarga);
                System.out.println("Diskon : 15%");
                System.out.println("Harga setelah diskon : " + hargaDiskon);
            } else {
                hargaDiskon = totalHarga;
            }

            pendapatanHarian+= hargaDiskon;

            i++;
        

        } while (jumlahTiket != 0);
       
        System.out.println("\nPendapatan harian : Rp. " + pendapatanHarian);

               
    }
}
