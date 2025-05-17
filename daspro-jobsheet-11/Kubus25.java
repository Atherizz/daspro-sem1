
import java.util.Scanner;

public class Kubus25 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); 
    System.out.print("Masukkan panjang sisi kubus : ");
    int sisi = scan.nextInt();
    int angka;

    // FUNGSI MENGHITUNG VOLUME KUBUS
    int volume = volumeKubus(sisi);
    System.out.println("Volume kubus : " + volume);

    // FUNGSI MENGHITUNG LUAS PERMUKAAN KUBUS
    int luasPermukaan = luasPermukaanKubus(sisi);
    System.out.println("luas permukaan kubus : " + luasPermukaan);
    }

    public static int volumeKubus (int sisi) {
         int volume = sisi * sisi * sisi;
         return volume;
        
    }

    public static int luasPermukaanKubus (int sisi) {
         int luasPermukaan = 6 * (sisi * sisi);
         return luasPermukaan;

    }
    
}
