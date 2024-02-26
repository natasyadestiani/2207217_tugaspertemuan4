/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalkeduapert4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class SoalKeduaPert4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input batas awal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Input batas akhir: ");
        int batasAkhir = scanner.nextInt();

        int jumlahBilanganGanjil = 0;
        System.out.print("Bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahBilanganGanjil++;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBanyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " yaitu " + jumlahBilanganGanjil);
    }
}
