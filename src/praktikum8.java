public class praktikum8 {
    public static void main(String[] args) {
        int Pb = 5, Pk = 7, a = 5;
            for ( int i = 1; i <= 5; i++) {
                for ( int j = 1; j <= 5; j ++) {
                    a += Pk;
                    System.out.print(a + " ");
                }
                a -= Pb;
                System.out.println(" ");
            }
    }
}
