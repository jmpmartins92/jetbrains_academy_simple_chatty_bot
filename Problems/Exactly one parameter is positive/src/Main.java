import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 > 0 && num2 < 1 && num3 < 1) {
            System.out.println(true);
        } else if (num2 > 0 && num1 < 1 && num3 < 1) {
            System.out.println(true);
        } else if (num3 > 0 && num1 < 1 && num2 < 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}