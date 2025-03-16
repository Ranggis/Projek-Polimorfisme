/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek_Polimorfisme;

/**
 *
 * @author LENOVO
 */
public class Bank {
    // Transfer ke rekening lain
    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer sebesar " + jumlah + " ke rekening " + rekeningTujuan);
    }

    // Transfer ke rekening lain di bank berbeda
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " dengan biaya: " + biaya);
    }

    // Transfer dengan tambahan berita
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        int biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " dengan biaya: " + biaya + " dan berita: " + berita);
    }

    // Method suku bunga standar
    void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
    
    // Method untuk menghitung biaya transfer berdasarkan bank tujuan
    int hitungBiayaTransfer(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI")) {
            return 5000;
        } else if (bankTujuan.equalsIgnoreCase("BCA")) {
            return 6000;
        } else {
            return 7500; // Biaya default untuk bank lain
        }
    }
}