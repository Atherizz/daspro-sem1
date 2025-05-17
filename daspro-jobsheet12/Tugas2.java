import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        int penjumlahan = penjumlahanRekursif(angka);
        System.out.print("penjumlahan rekursif : " + penjumlahan);

    }

    public static int penjumlahanRekursif (int a) {
        if (a == 0) {
            return a;
        } else {
            return a + penjumlahanRekursif(a-1);
        }
    }
}
