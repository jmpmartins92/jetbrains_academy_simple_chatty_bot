import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();
        if (x1 == x2 || y1 == y2 || (Math.abs(x1 - x2)) / (Math.abs(y1 - y2)) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}