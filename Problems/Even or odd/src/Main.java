import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        while (!check) {
            int num = scanner.nextInt();
            if (num == 0) {
                check = true;
                break;
            } else if (num % 2 == 0) {
                System.out.println("even");
            } else if (num % 2 != 0) {
                System.out.println("odd");
            }
        }
    }
}