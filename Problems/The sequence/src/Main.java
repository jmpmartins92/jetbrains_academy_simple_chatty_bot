import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int num = 0;
        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num > max && num % 4 == 0) {
                max = num;
            }

        }
        System.out.println(max);
    }
}