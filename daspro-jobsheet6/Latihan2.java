import java.util.Scanner;

public class Latihan2 {
    
    public static void main(String[] args) {
        
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;
    

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = sc.next();

        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = sc.nextInt();



        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else if (jumlahBuku <= 3) {
                diskon += 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;
            } 
        }


        System.out.println("jenis buku : " + jenisBuku);
        System.out.println("jumlah buku : " + jumlahBuku);
        System.out.println("jumlah diskon : " + diskon + "%");
       
        

    }
}
