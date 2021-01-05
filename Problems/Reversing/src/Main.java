import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int alg1 = number / 100;
        int alg2 = (number - alg1 * 100) / 10;
        int alg3 = number - alg1 * 100 - alg2 * 10;


        System.out.println(alg1 + alg2 * 10 + alg3 * 100);
    }
}