/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teswargalab;

class Kamar {
    private String tipeKamar;
    private double hargaKamar;
    private String namaPenyewa;

    public Kamar(String tipeKamar, double hargaKamar) {
        this.tipeKamar = tipeKamar;
        this.hargaKamar = hargaKamar;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public double hitungTotalHarga(int lamaSewa, boolean kartuMember, int usia) {
        double totalHarga = hargaKamar * lamaSewa;

        
        if (totalHarga > 700000) {
            totalHarga *= 0.95; // Diskon 5%
        } else if (totalHarga > 500000) {
            totalHarga *= 0.97; // Diskon 3%
        }

        
        if (lamaSewa > 7) {
            totalHarga *= 0.9; // Diskon 10%
        }

       
        if (kartuMember) {
            totalHarga *= 0.95; // Diskon 5%
        }

       
        if (usia < 19) {
            System.out.println("Maaf Anda Belum Cukup Umur Untuk Memesan Kamar");
            System.exit(0);
        }

        return totalHarga;
    }
}