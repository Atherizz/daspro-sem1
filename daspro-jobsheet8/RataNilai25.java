import java.util.Scanner;

public class RataNilai25 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nilaiMhs, totalNilai, rataNilai;

        int i = 1;
        while (i <= 5) {
        System.out.println("Input Nilai mahasiswa ke " + i + " : ");
         totalNilai = 0;     
        
        for(int j = 1; j <= 5; j++) {
            System.out.print("Nilai ke - " + j + " = ");
            nilaiMhs = sc.nextInt();
            totalNilai+=nilaiMhs;
        }
        rataNilai = totalNilai/5;
        i++;

        System.out.println("Rata - Rata Nilai Mahasiswa ke " + (i-1) + " adalah " + rataNilai);
    }

    }
}
