import java.util.Scanner;
import java.util.Random;

public class praktikum11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int jumlahMahasiswa, mahasiswaCount,Tugas, nilaiTugas, jumlahTugas, nilai, hadir, nilaiKehadiran, nilaiFinal, nilaiAkhir;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();

        mahasiswaCount = 1;
        do {
            System.out.println("Mahasiswa ke-" + mahasiswaCount);
            System.out.print("Masukkan nama mahasiswa: ");
            String namaMahasiswa = scanner.next();

            Tugas = 0;
            jumlahTugas = random.nextInt(11); // Jumlah tugas
            for (int i = 1; i <= jumlahTugas; i++) {
                nilai = random.nextInt(101);
                System.out.println("Nilai tugas " + i + ": " + nilai);
                Tugas += nilai;
            }

            hadir =0;
            for (int i = 1; i <= 16; i++) {
                System.out.print("Masukkan kehadiran " + i + "(0 = tidak hadir, 1 = hadir): ");
                hadir += scanner.nextInt();
            }

            nilaiTugas = Tugas / jumlahTugas ;

            nilaiKehadiran = (hadir * 100) / 16;

            nilaiFinal = random.nextInt(101) ;

            nilaiAkhir = (nilaiTugas + nilaiFinal + nilaiKehadiran) / 3;

            System.out.println("Nilai Tugas " + namaMahasiswa + ": " + nilaiTugas);

            System.out.println("Nilai Kehadiran " + namaMahasiswa + ": " + nilaiKehadiran);

            System.out.println("Nilai Final " + namaMahasiswa + ": " + nilaiFinal);

            System.out.println("Nilai Akhir " + namaMahasiswa + ": " + nilaiAkhir);

            mahasiswaCount++;

            try {
                Thread.sleep(500); // Delay for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (mahasiswaCount <= jumlahMahasiswa);

        scanner.close();
    }
}
