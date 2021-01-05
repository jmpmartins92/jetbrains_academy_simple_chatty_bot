import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        double perc = p / 100;
        int year = 0;
        while (m < k) {
            m = m + m * perc;
            year++;
        }
        System.out.println(year);
    }
}

