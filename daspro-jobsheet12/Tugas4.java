import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    

        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        System.out.println("Deret Fibonacci ke - " + angka);
        for(int i = 0; i < angka; i++) {
        System.out.print(fibonacci(i) + " ");
       }
    }

    public static int fibonacci (int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
    }
    }
}
