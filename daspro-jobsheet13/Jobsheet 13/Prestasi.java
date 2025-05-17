import java.util.Scanner;
public class Prestasi {
    static int counter = 0;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String prestasi [][] = new String[100][4];
        String kategori [] = {"Nama", "NIM", "Jenis", "Tingkat"};  
        int tahun [] = new int[100];      
        
        int menu;
        String lanjut;
        
        do {
            System.out.println("==== PENCATATAN PRESTASI MAHASISWA =====");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            
        switch (menu) {
            case 1:
            System.out.println("Tambah Data Prestasi");
            inputPrestasi(prestasi, kategori, tahun);
            break;
            case 2:
            tampilanPrestasi(prestasi, kategori, tahun);
            break;   
            case 3:
            System.out.println("Analisis Prestasi");
            analisisPrestasi(prestasi, kategori, tahun);
            break;    
            case 4:
            System.out.println("Anda Keluar Dari Program!");   
            return;
            default:
            System.out.println("Input dari 1 - 4!");
            break;
        }
        
        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n) : ");
        lanjut = sc.next();
        System.out.println();
    } while (lanjut.equalsIgnoreCase("y"));
}

    public static void inputPrestasi(String[][] prestasi, String[] kategori, int[] tahun) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Nama Mahasiswa     : ");
    prestasi[counter][0] = sc.nextLine();
    System.out.print("Masukkan NIM Mahasiswa      : ");
    prestasi[counter][1] = sc.nextLine();
    System.out.print("Masukkan Jenis Prestasi     : ");
    prestasi[counter][2] = sc.nextLine();
    System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
    prestasi[counter][3] = sc.nextLine();
    
    while (!prestasi[counter][3].equalsIgnoreCase("lokal") && !prestasi[counter][3].equalsIgnoreCase("nasional") && !prestasi[counter][3].equalsIgnoreCase("internasional")) {
        System.out.println("Input tidak valid. Silakan coba lagi!");
        System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
        prestasi[counter][3] = sc.nextLine();
    }
    
    for (int i=0; i<=i; i++) {
        System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
        tahun[counter] = sc.nextInt();
        if (tahun[counter] >= 2010 && tahun[counter] <= 2024) {
            break;
        } else {
            System.out.println("Tahun tidak valid. Silakan coba lagi!");
        }
    }
    System.out.println("Data prestasi berhasil ditambahkan.");
    counter++;
    }

    static void tampilanPrestasi(String prestasi[][], String kategori[], int tahun[]) {
        if (counter == 0) {
            System.out.println("Belum ada data prestasi yang ditambahkan!");
        } else {
            System.out.println("Seluruh Prestasi Yang Tercatat");
            for (int i = 0; i < counter; i++) {
                for (int j = 0; j < prestasi[0].length; j++) {
                    System.out.print(kategori[j] + " : " + prestasi[i][j] + "\t" + " | ");
                }          
                System.out.println("Tahun : " + tahun[i]);
            }
        }
    }

    public static void analisisPrestasi (String[][] prestasi, String[] kategori, int[] tahun) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis : ");
        String jenisPrestasi = sc.nextLine();
        boolean isEmpty = true;

        System.out.print("Masukkan Tahun Prestasi yang ingin dianalisis : ");
        int tahunPrestasi = sc.nextInt();

        for(int i = 0; i < counter; i++) {
            for (int j = 0; j < prestasi[0].length; j++) {
                if (j == 2) {
                    continue;
                }
                if (prestasi[i][2].equalsIgnoreCase(jenisPrestasi)) {
                    if (tahun[i] == tahunPrestasi) {
                        System.out.print(kategori[j] + " : " + prestasi[i][j] + " | ");
                        isEmpty = false;
                    } 
                }
            } System.out.println();
        }
        if (isEmpty) {
            System.out.print("Data Prestasi Tidak Ditemukan!\n");
        }
    }
}
