public class programKu {
    
    public static void main(String[] args) {
        int temp = jumlah(1, 1);
        tampilJumlah(temp, 5);
    }

    public static void tampilHinggaKei(int i) {
        for (int j = 1; j <= i;j++) {
            System.out.println(j);
        }
    }

    public static int jumlah (int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void tampilJumlah (int bil1, int bil2) {
        tampilHinggaKei(jumlah(bil1,bil2));
    }
}
