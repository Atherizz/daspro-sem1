import java.util.Scanner;

public class SearchNilai25 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isFound = true;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlahNilai = sc.nextInt();
        
        int[] arrNilai = new int[jumlahNilai];
       
        int hasil = 0;

        for(int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang akan dicari : ");
        int key = sc.nextInt();

        for(int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                isFound = true;
                break;
            } else {
                isFound = false;
            }
        }

        if (isFound == true) {
        System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke : " + (hasil+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
