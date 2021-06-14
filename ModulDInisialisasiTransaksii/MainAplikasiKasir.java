/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.DaftarMenu;
import classes.Kuah;
import classes.Minuman;
import classes.Ramen;
import classes.Toping;
import java.util.Scanner;

import java.util.Scanner;


public class MainAplikasiKasir {

    public DaftarMenu daftarMenu;
    // Tambahkan
    public static double PAJAK_PPN =0.10;
    public static double PAJAK_SERVCE =0.5;
    // End of Tambahkan

    public static void main(String[] args){ 
         Scanner input = new Scanner(System.in);
         // Tambahkan
         String no_transaksi, nama_pemesan, tanggal, no_meja= "";
         String transaksi_lagi= "", keerangan= "", makan_ditempat;
         int jumlah_pesanan, no_menu;
         // End Tambahkan
         MainAplikasiKasir app = new MainAplikasiKasir();

         app.generateDaftarMenu();
    }
   
    
     public void generateDaftarMenu() {

      daftarMenu = new DaftarMenu();

        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Kuah Orisini;"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Toping("Baso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));
        daftarMenu.tambahMenu(new Minuman("Jus Alpukat SPC", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Capucino Coffee", 15000));
        daftarMenu.tambahMenu(new Minuman("Vientnam Dripp", 14000));

        daftarMenu.tampilDaftarMenu();
    }
}
