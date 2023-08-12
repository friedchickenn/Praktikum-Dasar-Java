import java.util.Random;

public class praktikum14 {
    public static void main(String[] args) {
        Random random = new Random();

        int T, Kb, Ad, R, Pb, L;
        double M, Tt, B;

        M = random.nextDouble();
        do {
            System.out.println("Nilai awal T: ");
            T = random.nextInt(4);
            if (T == 0) {
                System.out.println("Nilai M: " + M);
            }
            if (T == 1) {
                System.out.print("Nilai Tt: ");
                Tt = random.nextDouble();
                M = M - Tt;
                System.out.println("Nilai M: " + M);
            }
            if (T == 2) {
                System.out.print("Nilai Kb: ");
                Kb = random.nextInt(2);
                if (Kb != 1) {
                    Ad = 2500;
                } else {
                    Ad = 0;
                }
                System.out.print("Nilai R: ");
                R = random.nextInt(100) + 1;
                M = M - R - Ad;
                System.out.println("Nilai M: " + M);
            }
            if (T == 3) {
                do {
                    Pb = random.nextInt(2);
                    System.out.print("nilai B: ");
                    B = random.nextDouble();
                    M = M - B;
                } while (Pb == 1);
                System.out.println("Nilai M: " + M);
            }
            L = random.nextInt(2);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (L == 1);

    }
}
