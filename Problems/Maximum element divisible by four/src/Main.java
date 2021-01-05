import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNums = scanner.nextInt();
        int maxEle = 0;
        for (int i = 1; i <= numNums; i++) {
            int num = scanner.nextInt();
            if (num > maxEle && num % 4 == 0) {
                maxEle = num;
            }
        }
        System.out.println(maxEle);
    }
}