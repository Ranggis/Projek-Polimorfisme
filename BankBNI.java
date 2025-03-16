/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek_Polimorfisme;

/**
 *
 * @author LENOVO
 */
public class BankBNI extends Bank{
    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("[BNI] Transfer sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " dengan biaya: " + biaya);
    }
}
