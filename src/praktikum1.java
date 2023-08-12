import java.util.Scanner;

public class praktikum1 {

    // Menghitung total resistansi pada rangkaian seri
    public static double hitungResistansiSeri(double r1, double r3) {
        return r1 + r3;
    }

    // Menghitung total resistansi pada rangkaian parallel
    public static double hitungResistansiParallel(double r3, double r4) {
        return 1.0 / r3 + 1.0 / r4;
    }

    // Menghitung tegangan (V) berdasarkan arus (I) dan resistansi (R)
    public static double hitungTegangan(double arus, double resistansi) {
        return arus * resistansi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai kuat arus (I) dalam Ampere: ");
        double arus = scanner.nextDouble();

        System.out.print("Masukkan nilai resistansi R1 (Ohm): ");
        double r1 = scanner.nextDouble();

        System.out.print("Masukkan nilai resistansi R2 (Ohm): ");
        double r2 = scanner.nextDouble();

        System.out.print("Masukkan nilai resistansi R3 (Ohm): ");
        double r3 = scanner.nextDouble();

        System.out.print("Masukkan nilai resistansi R4 (Ohm): ");
        double r4 = scanner.nextDouble();

        double totalResistansi = 0;

        // Memilih antara rangkaian seri atau parallel berdasarkan nilai resistansi R2
        if (r2 == 0) {
            // R2 = 0, maka rangkaian parallel
            totalResistansi = hitungResistansiSeri(r1, r3) + hitungResistansiParallel(r3, r4);
        } else {
            // R2 > 0, maka rangkaian seri dengan cabang R2
            totalResistansi = hitungResistansiSeri(r1, r3) + r2 + hitungResistansiParallel(r3, r4);
        }

        // Menghitung tegangan (V) dengan rumus V=I.R
        double tegangan = hitungTegangan(arus, totalResistansi);

        System.out.println("Tegangan (V) pada rangkaian: " + tegangan + " Volt");

        scanner.close();
    }
}
