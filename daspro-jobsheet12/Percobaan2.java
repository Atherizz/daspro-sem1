import java.util.Scanner;

public class Percobaan2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        System.out.print("masukkan pangkat : ");
        int pangkat = sc.nextInt();
        
        int hasilPangkat = pangkatRekursif(angka, pangkat);
        System.out.println("hasil pangkat dari " + angka  + "^" + pangkat  + " adalah " + hasilPangkat);
        for (int i = 1; i <= pangkat; i++) {
            System.out.print(angka + "*");
        }
        System.out.print("1 = " + hasilPangkat);
    }

    public static int pangkatRekursif (int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * pangkatRekursif(a, b-1);
        }
    }
}
