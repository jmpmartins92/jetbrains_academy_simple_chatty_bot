import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String[] numbers = number.split("(?<=.)");
        int size = numbers.length;
        if (size > 1) {
            System.out.println(parseInt(numbers[size - 2]));
        } else {
            System.out.println(0);
        }

    }
}