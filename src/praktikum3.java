import java.util.Scanner;

public class praktikum3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan nilai y: ");
        int y = scanner.nextInt();

        int total=1;
        int i=x, n=y;

        for ( int j = 0; j < x ; j++) {
            total *= n;
        }
        System.out.println(total);
        scanner.close();
    }
}

