import java.util.Scanner;

public class praktikum6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input koefisien, pangkat, dan operator
        double x1, y1, z1, c, x2, y2, z2;
        char x3, y3, z3;

        System.out.print("Masukkan koefisien x1: ");
        x1 = scanner.nextDouble();
        System.out.print("Masukkan koefisien y1: ");
        y1 = scanner.nextDouble();
        System.out.print("Masukkan koefisien z1: ");
        z1 = scanner.nextDouble();
        System.out.print("Masukkan konstanta c: ");
        c = scanner.nextDouble();

        System.out.print("Masukkan pangkat x2: ");
        x2 = scanner.nextDouble();
        System.out.print("Masukkan pangkat y2: ");
        y2 = scanner.nextDouble();
        System.out.print("Masukkan pangkat z2: ");
        z2 = scanner.nextDouble();

        System.out.print("Masukkan operator x3 (+ atau -): ");
        x3 = scanner.next().charAt(0);
        System.out.print("Masukkan operator y3 (+ atau -): ");
        y3 = scanner.next().charAt(0);
        System.out.print("Masukkan operator z3 (+ atau -): ");
        z3 = scanner.next().charAt(0);

        // Hitung koefisien dengan pangkat yang baru
        double koefisien_1, koefisien_2, koefisien_3, pangkat_1, pangkat_2, pangkat_3;
        char operator_1, operator_2, operator_3;

        pangkat_1 = x2;
        pangkat_2 = y2;
        pangkat_3 = z2;

        operator_1 = x3;
        operator_2 = y3;
        operator_3 = z3;

        koefisien_1 = x1 * x2; pangkat_1--;
        koefisien_2 = y1 * y2; pangkat_2--;
        koefisien_3 = z1 * z2; pangkat_3--;

        //cetak kelayar
        System.out.print("koefisien 1 = " + koefisien_1 + " | ");
        System.out.print("koefisien 2 = " + koefisien_2 + " | ");
        System.out.print("koefisien 3 = " + koefisien_3 + " | ");
        System.out.print("pangkat 1 = " + pangkat_1 + " | ");
        System.out.print("pangkat 2 = " + pangkat_2 + " | ");
        System.out.println ("pangkat 3= " + pangkat_3);


        // Hitung nilai variabel A
        double A, nilai_variabel, hasil_1, hasil_2, hasil_3;
        System.out.print ("Masukan nilai variabel A: ");
        A = scanner.nextDouble();
        nilai_variabel = A;
        hasil_1 = 1;
        for (int i = 0; i < pangkat_1; i++) {
             hasil_1 = hasil_1 * A; }
        koefisien_1 *= hasil_1;
        hasil_2 = 1;
        for (int i = 0; i < pangkat_2; i++) {
            hasil_2 *= A; }
        koefisien_2 *= hasil_2;
        hasil_3 = 1;
        for (int i = 0; i < pangkat_3; i++) {
            hasil_3 *= A; }
        koefisien_3 *= hasil_3;

        // Hitung total hasil aritmatika
        double total = 0;
        if (operator_1 == '+') {
            total = koefisien_1 + koefisien_2;
        } else if (operator_1 == '-') {
            total = koefisien_1 - koefisien_2;}
        if (operator_2 == '+') {
            total += koefisien_3;
        } else {
            total -= koefisien_3;
        }

        // Cetak semua hasil ke layar
        System.out.print("hasil 1 = " + hasil_1 + " | ");
        System.out.print("hasil 2 = " + hasil_2 + " | ");
        System.out.print("hasil 3 = " + hasil_3 + " | ");
        System.out.print("koefisien 1 = " + koefisien_1 + " | ");
        System.out.print("koefisien 2 = " + koefisien_2 + " | ");
        System.out.print("koefisien 3 = " + koefisien_3 + " | ");
        System.out.println("total = " + total);
    }
}
