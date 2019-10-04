/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan28;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");
        System.out.print("\nMasukkan Kalimat : ");
        String kalimat = sc.nextLine();
        System.out.print("Ganti Kata : ");
        String cari = sc.next();
        System.out.print("Menjadi Kata : ");
        String ganti = sc.next();
        String hasil = kalimat.replace(cari, ganti);
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+hasil);
    }
    
}
