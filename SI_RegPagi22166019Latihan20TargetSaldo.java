/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan20.targetsaldo;

import java.text.DecimalFormat;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : Cara mencari banyak bulan sampai mencapai target saldo.
 */
public class SI_RegPagi22166019Latihan20TargetSaldo {

    public static void main(String[] args) {
        
        double saldoAwal = 3500000;
        double bungaPerBulan = 8.0;
        double saldoTarget = 6000000;

        // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);

        int bulan = 0;
        while (saldoAwal < saldoTarget) {
            double bunga = saldoAwal * (bungaPerBulan / 100);
            saldoAwal += bunga;
            bulan++;

            // Format saldo per bulan sebagai mata uang
            String saldoBulanFormatted = df.format(saldoAwal);
            System.out.println("Saldo di Bulan ke- " + bulan + ": Rp. " + saldoBulanFormatted);
        }
    }
}
    

