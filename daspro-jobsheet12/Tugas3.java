import java.util.Scanner;

public class Tugas3 {
    
    public static void main(String[] args) {
        int faktor = 2; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        cekPrimaRekursif(angka, faktor);
    }

    public static void cekPrimaRekursif (int n, int faktor) {
        if (n < 2) {
            System.out.println("BUKAN BILANGAN PRIMA");
        } else if (faktor == n) {
          System.out.println("BILANGAN PRIMA");
        } else if (n % faktor == 0){
            System.out.println("BUKAN BILANGAN PRIMA");
        } else {
            cekPrimaRekursif(n, faktor+1);
        }
    }
}
