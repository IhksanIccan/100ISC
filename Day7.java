package day7;

import java.util.Scanner;

public class day7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a, b, c;
        
        // ( + - * / % ) //
        
        System.out.print("Masukkan angka 1 = ");
        a = input.nextInt();
        System.out.print("Masukkan angka 2 = ");
        b = input.nextInt();
        c = a + b;
        System.out.print(a + " + " + b + " = ");
        System.out.println(c);
        c = a - b;
        System.out.println(b + " - " + a + " = " + c);
        c = a * b;
        System.out.println(a + " x " + b + " = " + c);
        c = a / b;
        System.out.println(a + " : " + b + " = " + c);
        c = a % b;
        System.out.println(a + " % " + b + " = " + c); 
           // sekian yang saya buat kali ini kak //
    }
    
}
