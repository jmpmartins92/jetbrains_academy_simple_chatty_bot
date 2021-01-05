import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        for (int i = 1; i <= n; i++) {
            int grade = scanner.nextInt();
            if (grade == 2) {
                numD++;
            } else if (grade == 3) {
                numC++;
            } else if (grade == 4) {
                numB++;
            } else if (grade == 5) {
                numA++;
            }
        }
        System.out.printf("%d %d %d %d", numD, numC, numB, numA);
    }
}