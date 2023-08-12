public class praktikum9 {
    public static void main(String[] args) {
        int a = 65;
        char b;
        for (int i = 1; i <= 5; i++) {
            b = (char) (a);
            for (int j = 5; j >= i; j--) {
                System.out.print(b + " ");
                b += 9;
            }
            System.out.println();
        }
    }
}
