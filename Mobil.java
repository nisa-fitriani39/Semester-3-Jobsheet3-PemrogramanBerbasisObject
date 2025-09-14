import java.util.Scanner;
public class Mobil {
    // Atribut private
    private String merek;
    private int kecepatan;

    // Constructor
    public Mobil(String merek) {
        this.merek = merek;
        this.kecepatan = 0;
    }

    // Getter untuk merek (read-only)
    public String getMerek() {
        return merek;
    }

    // Setter tidak dibuat, agar merek tidak bisa diubah setelah di-set di constructor

    // Setter untuk kecepatan (write-only)
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Getter untuk kecepatan tidak dibuat, agar hanya bisa ditulis (write-only)

    // Method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Merek Mobil   : " + merek);
        System.out.println("Kecepatan     : " + kecepatan + " km/jam");
    }
}

// Class utama untuk uji coba
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil m1 = new Mobil("Toyota");

        // Merek hanya bisa dibaca
        System.out.println("Merek mobil: " + m1.getMerek());

        // Kecepatan hanya bisa ditulis
        m1.setKecepatan(120);

        // Menampilkan informasi mobil
        m1.tampilkanInfo();
    }
}
