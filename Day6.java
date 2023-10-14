package day6_inputdata;

import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama ,jurusan ,alamat;
        int umur;
        
        // input(Scanner Sytem.in)//
        
        System.out.print("Nama \t\t: ");
        nama = input.nextLine();
        System.out.print("Jurusan \t: ");
        jurusan = input.nextLine();
        System.out.print("Alamat \t\t: ");
        alamat = input.nextLine();
        System.out.print("Umur \t\t: ");
        umur = input.nextInt();
        System.out.println("==================================");
        System.out.println("Perkenalkan nama saya "+nama+"\nJurusan  "+jurusan);
        System.out.println("Alamat saya itu di "+alamat+"\nUmur saya "+umur+" tahun");
               
            // sekian yang saya kerjakan kak di hari ke 6 ini//
        
    }
    
}
