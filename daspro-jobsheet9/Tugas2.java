import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {
        
        System.out.println("========= KASIR KAFE =========");
        System.out.println("===============================");

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahPesanan = sc.nextInt();

        int totalHarga = 0;

        String [] namaPesanan = new String[jumlahPesanan];
        int [] harga = new int[jumlahPesanan];

        for(int i = 0; i < namaPesanan.length; i++) {
            sc.nextLine();
            System.out.print("Masukkan pesanan ke " + (i+1) + " : ");
            namaPesanan[i] = sc.nextLine();
           
            System.out.print("Masukkan harga pesanan ke " + (i+1) + " : ");
            harga[i] = sc.nextInt();
        }
        
        System.out.println();

        System.out.println("DAFTAR PESANAN : ");

        for(int i = 0; i < harga.length; i++) {
            System.out.println((i+1) + ". " + namaPesanan[i] + " ==> " + harga[i]) ;
            totalHarga += harga[i];
        }

        System.out.println();
        System.out.println("TOTAL BIAYA : " + totalHarga);

    }
}
