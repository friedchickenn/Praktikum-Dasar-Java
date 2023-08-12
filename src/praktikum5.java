import java.util.Scanner;
public class praktikum5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1, y1, x2, y2, jarak, jarakX, jarakY;
        System.out.println("Masukkan koordinat titik A");
        System.out.print("Koordinat X: ");
        x1 = scanner.nextDouble();
        System.out.print("Koordinat Y: ");
        y1 = scanner.nextDouble();
        System.out.println("Titik koordinat A adalah ("+ x1 + "," + y1+ ")");

        System.out.println("Masukkan koordinat titik B");
        System.out.print("Koordinat X: ");
        x2 = scanner.nextDouble();
        System.out.print("Koordinat Y: ");
        y2 = scanner.nextDouble();
        System.out.println("Titik koordinat B adalah ("+ x2 + "," + y2+ ")");

        jarakX = x2 - x1;
        jarakY = y2 - y1;
        jarak = Math.sqrt (jarakX * jarakX + jarakY * jarakY);

        System.out.println("Jarak antara titik A dan B adalah: " + jarak);
    }

}

