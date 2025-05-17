import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt(); 

        System.out.println("DERET DESCENDING REKURSIF");
        deretDescendingRekursif(angka);
        System.out.println();
        System.out.println("DERET DESCENDING ITERATIF");
        deretDescendingIteratif(angka);
    }

    public static void deretDescendingRekursif (int a) {
        System.out.print(a + " ");
        if (a == 0) {
            return;
        } else {
           deretDescendingRekursif(a - 1);

        }
    }
    
    public static void deretDescendingIteratif (int a) {
        for (int i = a; i >= 0; i--) {
            System.out.print(a-- + " ");
        }
    }
}
