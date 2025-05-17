import java.util.Scanner;

public class Kafe25 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 /100f;
        double totalHarga, nominalBayar;

        System.out.print("Masukkan keanggotaan (true/false) : ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi : ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembeliam teh : ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti : ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        int nominalInt;
        nominalInt = (int)nominalBayar;

        byte totalByte;
        totalByte = (byte)totalHarga;
        

        System.out.println("Keanggotaan pelanggan : " + keanggotaan);
        System.out.println("Item pembelian : " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti, " );
        System.out.println("Nominal Bayar : " + nominalBayar);
        System.out.println("Nominal Int : " + nominalInt);
        System.out.println("Total Byte : " + totalByte);


    }
}
