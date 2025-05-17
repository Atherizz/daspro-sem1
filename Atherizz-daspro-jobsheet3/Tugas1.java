import java.util.Scanner;

public class Tugas1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean isCek;
        double penggunaanListrik;
        int tarifPerKwh = 1500;

        System.out.print("Masukkan penggunaan listrik dalam kWh : ");
        penggunaanListrik = input.nextInt();

        double tarifTotal = tarifPerKwh * penggunaanListrik;
        isCek = penggunaanListrik > 500;
        
        System.out.println("tarif pembayaran : Rp." + tarifTotal);
        System.out.println("status pengecekan : " + isCek);
    } 
}
