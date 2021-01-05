import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int num = -1;
        while(num != 0) {
            num = scanner.nextInt();
            counter++;
        }
        System.out.println(counter - 1);
    }
}