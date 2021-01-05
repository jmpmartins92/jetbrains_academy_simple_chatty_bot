import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDays = scanner.nextInt();
        int foodDay = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel = scanner.nextInt();
        System.out.println(numDays * foodDay + (numDays - 1) * hotel + 2 * flight);
    }
}