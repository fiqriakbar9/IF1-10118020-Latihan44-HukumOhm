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
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        
    }
    
    public Baterai(float kuatArus, float hambatan){
       this.kuatArus=kuatArus;
        this.hambatan=hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
       return kuatArus*hambatan; 
    }
}
