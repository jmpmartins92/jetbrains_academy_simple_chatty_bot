import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println(true);
            System.exit(0);
        }
        if (num1 == num2) {
            num1 = num2;
            num2 = scanner.nextInt();
        }
        boolean cond = true;
        if (num1 > num2 && cond) {
            while (num2 != 0) {
                int num3 = scanner.nextInt();
                if (num3 == 0) {
                    break;
                }
                if (num2 >= num3) {
                    num2 = num3;
                    cond = true;
                } else {
                    cond = false;
                    break;
                }
            }

        }
        if (num1 < num2 && cond) {
            while (num2 != 0) {
                int num3 = scanner.nextInt();
                if (num3 == 0) {
                    break;
                }
                if (num2 <= num3) {
                    num2 = num3;
                    cond = true;
                } else {
                    cond = false;
                    break;
                }
            }

        }

        System.out.println(cond);
    }
}