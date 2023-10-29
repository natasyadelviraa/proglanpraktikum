import java.util.Scanner;

/**
 * kelas tabung
 */

class Tabung {
    // Variabel anggota untuk menyimpan jari-jari dan tinggi tabung
    private double jariJari;
    private double tinggi;

    // Konstruktor untuk inisialisasi jari-jari dan tinggi tabung

    /**
     *
     * @param jariJari jari jari tabung
     * @param tinggi tinggi tabung
     */
    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    /**
     *
     * @return volume tabung
     */

    // Metode untuk menghitung volume tabung
    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}


public class Volumetabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jari-jari dan tinggi tabung dari pengguna
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();

        // Membuat objek Tabung
        Tabung tabung = new Tabung(jariJari, tinggi);

        // Menghitung dan menampilkan volume tabung
        double volume = tabung.hitungVolume();
        System.out.println("Volume tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi + " adalah: " + volume);

        scanner.close();
    }
}
