import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //int num = 2002;
        int alg1 = num / 1000;
        int alg2 = (num - alg1 * 1000) / 100;
        int alg3 = (num - alg1 * 1000 - alg2 * 100) / 10;
        int alg4 = num - alg1 * 1000 - alg2 * 100 - alg3 * 10;
        /*System.out.println(alg1);
        System.out.println(alg2);
        System.out.println(alg3);
        System.out.println(alg4);*/
        if (alg1 == alg4 && alg2 == alg3) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}