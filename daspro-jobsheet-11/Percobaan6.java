import java.util.Scanner;

public class Percobaan6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukkan panjang : ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok adalah :" + vol);
        
        
    }

    public static int hitungLuas (int p, int l) {
        int L = p * l;
        return L;
    }

    public static int hitungVolume (int t, int a, int b) {
        int volume = hitungLuas(a, b) * t;
        return volume;
    }
}
