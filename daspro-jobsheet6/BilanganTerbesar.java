import java.util.Scanner;

public class BilanganTerbesar {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       System.out.print("Masukkan Bilangan 1 : ");
       int bil1 = sc.nextInt();

       System.out.print("Masukkan Bilangan 2 : ");
       int bil2 = sc.nextInt();

       System.out.print("Masukkan Bilangan 3 : ");
       int bil3 = sc.nextInt();
       int bilanganTerbesar = 0;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilanganTerbesar = bil1;
            } else {
                bilanganTerbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                bilanganTerbesar = bil2;
            } else {
                bilanganTerbesar = bil3;
            }
        }
    
        System.out.println("bilangan terbesar = " + bilanganTerbesar);

    }
}
