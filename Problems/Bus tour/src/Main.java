import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numBridges = scanner.nextInt();
        for (int i = 1; i <= numBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.printf("Will crash on bridge %d", i);
                break;
            } else if (!scanner.hasNext()) {
                System.out.println("Will not crash");
            }
        }

    }
}