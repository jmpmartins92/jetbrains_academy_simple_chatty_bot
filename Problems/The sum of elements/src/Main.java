import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = -1;
        while (num != 0) {
            num = scanner.nextInt();
            sum = sum + num;

        }
        System.out.println(sum);
    }
}