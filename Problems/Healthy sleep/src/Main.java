import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minHours = scanner.nextInt();
        int maxHours = scanner.nextInt();
        int annHours = scanner.nextInt();
        if (annHours >= minHours && annHours <= maxHours) {
            System.out.println("Normal");
        } else if (annHours < minHours) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}