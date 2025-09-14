class Mobil {
    // Atribut dibuat private
    private String merek;      // hanya bisa dibaca (read-only)
    private int kecepatan;     // hanya bisa ditulis (write-only)

    // Constructor
    public Mobil(String merek) {
        this.merek = merek;
        this.kecepatan = 0;
    }

    // Getter untuk merek (read-only)
    public String getMerek() {
        return this.merek;
    }

    // Tidak ada setter untuk merek → agar tidak bisa diubah

    // Setter untuk kecepatan (write-only)
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Tidak ada getter untuk kecepatan → agar tidak bisa dibaca langsung

    // Method tampilkan info
    public void tampilkanInfo() {
        System.out.println("Merek Mobil   : " + this.merek);
        System.out.println("Kecepatan     : " + this.kecepatan + " km/jam");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Honda");

        // Atribut merek hanya bisa dibaca
        System.out.println("Merek mobil: " + mobil1.getMerek());

        // Atribut kecepatan hanya bisa ditulis
        mobil1.setKecepatan(100);

        // Menampilkan info mobil
        mobil1.tampilkanInfo();
    }
}
