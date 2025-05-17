import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jenis,durasi;
        int total = 0;
        int i = 1;

        System.out.println("1. Mobil \n2. Motor \n0. Keluar");

        do {
            System.out.print("Masukkan jenis kendaraan ke - " + i + " :");
        
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (jam) kendaraan ke - " + i + " :");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total+= 12500;
                } else if (jenis == 1) {
                    total+= durasi * 3000;
                } else {
                    total+= durasi * 2000;
                }
            } else  {
                if (jenis == 0) {
                continue; 
                } else {
                System.out.println("Masukkan opsi 1, 2, dan 0 saja!");
                continue; 
                }
                
            }
            i++;
          
        } while (jenis!= 0);

        System.out.println("total pendapatan parkir : " + total);
       
    }
}
