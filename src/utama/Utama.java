/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menghitung tegangan
 * listrik 
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai batre = new Baterai(3,12);
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuar arus yang mengalir pada suatu kawat penghatar"
                + "\nakan berbanding lurus dengan beda potensial"
                + "\npada ujung-ujung kawat penghantar tersebut"
                + "\nasalkan suhu kawat dijawa konstan.");
        
        System.out.println("\nKuat Arus : "+batre.getKuatArus()+" Ampere");
        System.out.println("Hambatan : "+batre.getHambatan()+" Ohm");
        System.out.println("Hasil Tegangan : "+batre.hitungTegangan()+" Volt");
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
    
}
