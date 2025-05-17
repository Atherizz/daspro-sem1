import java.util.Scanner;

public class ArrayRataNilai25 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalMhsLulus = 0;
        double totalMhsTdkLulus = 0;
        double rata2MhsLulus;
        double rata2MhsTdkLulus;
        int mhsLulus = 0;
        int mhsTdkLulus = 0;

   

        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length;i++) {
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                totalMhsLulus += nilaiMhs[i];
            } else {
                mhsTdkLulus++;
                totalMhsTdkLulus += nilaiMhs[i];
            }
          
        }

        rata2MhsLulus = totalMhsLulus / mhsLulus;
        rata2MhsTdkLulus = totalMhsTdkLulus / mhsTdkLulus;
        System.out.println("Rata - rata nilai lulus = " + rata2MhsLulus);
        System.out.println("Rata - rata nilai tidak lulus = " + rata2MhsTdkLulus);
        System.out.println("Jumlah mahasiswa lulus : " + mhsLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + mhsTdkLulus);
    }
}
