package H79;

import java.util.Scanner;

public class H79 {
    
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.print("Masukkan gaji : Rp. ");
        double gajipokok = can.nextDouble();
        
        System.out.print("lembur (Jam) : ");
        int lembur = can.nextInt();
        
        double gajilemburPerjam = 45000;
        
        double gajilembur = lembur * gajilemburPerjam;
        double gajibersih = gajipokok + gajilembur;
        System.out.println("Gaji bersih : Rp."+ gajibersih);
    }
