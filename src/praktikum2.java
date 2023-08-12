public class praktikum2 {
    public static void main(String[] args) {
        int n=0, n1=0, n2=1;
        System.out.print(" "+n1); System.out.print(" "+n2);
        for ( int i=0; i<10; i++)
        {
            n1 = n1 + n2;
            n = n2;
            n2 = n1;
            n1 = n;
            System.out.print(" "+n1);
        }
    }
}