import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        System.out.println("The form for " + words.get(0) + " is completed. " +
                "We will contact you if we need a chef that cooks " + words.get(4) + " dishes.");
    }
}