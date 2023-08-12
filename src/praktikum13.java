public class praktikum13 {
    public static void main(String[] args) {
        int tinggi = 5;
        int lebar = 5;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= lebar; j++) {
                if (i % 2 == 0) {
                    if (j == 1 || j == lebar) {
                        System.out.print(" +");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print(" +");
                }
            }
            System.out.println();
        }
    }
}
