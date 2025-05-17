import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int jamKerja;
        double upahPerJam, totalGaji, gajiDanBonus, nominalFixGaji;

        double bonus = 10/100.0;
        double pajak = 5 /100.0;

        System.out.print("Masukkan jumlah jam kerja : ");
        jamKerja = input.nextInt();

        System.out.print("Masukkan upah per jam : ");
        upahPerJam = input.nextDouble();

        totalGaji = jamKerja * upahPerJam;
        gajiDanBonus = totalGaji + (bonus * totalGaji);
        nominalFixGaji = gajiDanBonus - (pajak * gajiDanBonus);

        System.out.print("gaji bulanan karyawan : " + nominalFixGaji);




    





    }    
}
