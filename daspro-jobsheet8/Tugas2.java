import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        int jumlahCabor, jumlahKampus;
        
        String namaAtlet, namaCabor, namaKampus;

        System.out.print("Masukkan jumlah politeknik yang mendaftar : ");
        jumlahKampus = sc.nextInt();
        sc.nextLine();

        for(int h = 1; h <= jumlahKampus; h++) {
        System.out.print("Masukkan nama politeknik ke " + h + " : ");
        namaKampus = sc.nextLine();
        System.out.print("Masukkan jumlah cabor : ");
        jumlahCabor = sc.nextInt();

        sc.nextLine();
        System.out.print("\nPoliteknik: " + namaKampus);

        for(int i = 1; i <= jumlahCabor; i++) {
            System.out.print("\nMasukkan nama cabor ke " + i + " : ");
            namaCabor = sc.nextLine();
            System.out.println("Cabor : " + namaCabor );
            String kumpulanAtlet = "\n";

            for(int j = 1; j <= 5; j++) {
                System.out.print("Nama atlet ke " + j + " : ");
                namaAtlet = sc.nextLine();
                kumpulanAtlet += namaAtlet + ", " ;
            }
            System.out.println("atlet " + namaCabor + " : " + kumpulanAtlet);
        }
    }
        
    }
}
