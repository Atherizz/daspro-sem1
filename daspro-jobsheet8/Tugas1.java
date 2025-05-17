import java.util.Scanner;
public class Tugas1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int angka;

            do {
            System.out.print("Masukkan angka (minimal 3): ");
             angka = sc.nextInt();
            } while (angka < 3);
            
            for(int i = 0; i < angka; i++) {
                if (i == 0 || i == angka-1) {
                    for(int j = 0; j < angka; j++) {
                        System.out.print(angka);
                    }
                } else {
                    System.out.print(angka);
                        for(int j = 0; j < (angka-2); j++) {
                            System.out.print(" ");
                        }
                        System.out.print(angka);
                }
                System.out.print("\n");
            }
            
        }
    
}
