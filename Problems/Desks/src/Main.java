import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        double tables = (Math.ceil(group1 / 2.0) + Math.ceil(group2 / 2.0) + Math.ceil(group3 / 2.0));
        System.out.println((int) tables);

    }
}