import java.util.Scanner;
import java.util.Random;
public class praktikum7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random R = new Random();

        int n, m, i = 1, k, ji = 24, tB = 0;
        double  B, d = 0,  P = 0;

        System.out.print("Masukkan Nilai n (x): ");
        n = scanner.nextInt();
        System.out.print("Masukkan Nilai m (x2): ");
        m = scanner.nextInt();

        do {
            k = R.nextInt(2)+1;

            if (k == 2) {
                d = 0.2 * n;
            }
            k = R.nextInt(n);
            if (k == 0) {
                P = 0.02 * n;
            }
            B = m + d - P;
            tB += B;
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }while ((i<ji) && (tB <= n));

        System.out.println("Nilai n: " + n);
        System.out.println("Nilai k: " + k);
        System.out.println("Nilai d: " + d);
        System.out.println("Nilai p: " + P);
        System.out.println("Nilai B: " + B);
        System.out.println("Nilai i: " + i);
        System.out.println("Nilai tb: " + tB);
        System.out.println("================================");
    }
}
