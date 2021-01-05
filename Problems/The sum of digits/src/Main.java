import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String[] numbers = number.split("(?<=.)");
        //System.out.println(Arrays.toString(numbers));
        System.out.println(parseInt(numbers[0]) + parseInt(numbers[1]) + parseInt(numbers[2]));
    }
}