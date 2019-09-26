/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program Kambing Global
 */
public class PBOULANG10114504Latihan5KambingGlobal {

   
    // Variabel jumlahkambing menjadi variabel instance
     int jumlahKambing = 88;
        
    // Methid untuk menampilkan jumlah kambing

    public void getJumlahKambing() {
        String getjumlahKambing = null;
            System.out.println ("Jumlah kambing : "+ getjumlahKambing);
    }
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println ("Jumlah kambing setelah ditambah : "+ jumlahKambing);
        
    }
    public static void main(String[]args){
        kambingGlobal kambingSusu = new kambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getjumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahKambing();
        
        
        
        }
    }
    

