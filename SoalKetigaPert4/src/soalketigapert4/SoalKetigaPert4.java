/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalketigapert4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class SoalKetigaPert4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai n dari inputan
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        // Menghitung n!
        int hasilFaktorial = 1;
        for (int i = 1; i <= n; i++) {
            hasilFaktorial *= i;
        }

        // Menampilkan hasil n!
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + " * ");
            }
        }
        System.out.println(" = " + hasilFaktorial);
    }
}
