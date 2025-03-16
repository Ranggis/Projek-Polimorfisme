/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek_Polimorfisme;

/**
 *
 * @author LENOVO
 */
public class Main {
        public static void main(String[] args) {
        Bank bank = new Bank();
        BankBNI bni = new BankBNI();
        BankBCA bca = new BankBCA();

        // Menguji method overloading di Bank
        System.out.println("\n=== Uji Method Overloading ===");
        bank.transferUang(1000000, "1234567890");
        bank.transferUang(2000000, "9876543210", "Mandiri");
        bank.transferUang(500000, "1357924680", "BRI", "Pembayaran tagihan");

        // Menguji method overriding
        System.out.println("\n=== Uji Method Overriding ===");
        bni.sukuBunga();
        bca.sukuBunga();
        
        bni.transferUang(1500000, "1111222233", "BNI");
        bca.transferUang(2500000, "4444555566", "BCA");
    }
}