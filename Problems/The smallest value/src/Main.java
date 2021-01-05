import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 1;
        long nfact = 1;
        while (nfact <= m) {
            n++;
            nfact = nfact * n;
        }
        System.out.println(n);
    }

}
