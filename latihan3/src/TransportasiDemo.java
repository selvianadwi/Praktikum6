//Paketkan berbagai class yang kita buat (Mobil dan Bicycle) dalam package Transportasi Panggil dari class lain (TransportasiDemo.java) dengan import.

import transportasi.Mobil;
import transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        Bicycle sepedaku = new Bicycle();
    }
}
