import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;

        int total = 0;
        double rataRata;

        int[] nilaiMhs = new int[jumlahMahasiswa];

        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke " + (i+1) + " : " + nilaiMhs[i]);
            total+= nilaiMhs[i];
        }

        for(int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiTerendah > nilaiMhs[i]) {
                nilaiTerendah = nilaiMhs[i];
            }

            if (nilaiTertinggi < nilaiMhs[i]) {
                nilaiTertinggi = nilaiMhs[0];
            }
        }

        rataRata = (double)total / nilaiMhs.length;
        System.out.println("rata rata : " + rataRata);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah : " + nilaiTerendah);

    }
}
