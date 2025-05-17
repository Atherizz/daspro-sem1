package Praktikum05;

import java.util.Scanner;

public class PemilihanHari25 {

    public static void main(String[] args) {


        // deklarasi scanner dan variabel
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;

        // perintah untuk membaca input
        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        // switch case untuk mengelompokkan hari
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday" :
            dayType = "weekend";
            default:
            dayType = "invalid day name";
                break;
        }

        System.out.println(dayName + " is a " + dayType);



    }
    
}
