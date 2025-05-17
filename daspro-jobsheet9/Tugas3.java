import java.util.Scanner;

public class Tugas3 {
    
    public static void main(String[] args) {

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        Scanner sc = new Scanner(System.in);
    

        
        System.out.print("Masukkan menu yang akan dicari : ");
        String keyMenu = sc.nextLine();

        int hasil;
        boolean isFound = true;

        for(int i = 0; i < menu.length; i++) {
            if (keyMenu.equalsIgnoreCase(menu[i])) {
                hasil = i;
                isFound = true;
                break;
            } else {
                isFound = false;
            }
        }

        if (isFound == true) {
            System.out.println("Makanan / Minuman tersedia!");
        } else {
            System.out.println("Makanan / Minuman tidak ada di menu");
        }
        
    }
}
