import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        } System.out.println(max);
    }
}