import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> heights = new ArrayList<>();
        while (scanner.hasNext()) {
            heights.add(scanner.nextInt());
        }
        List<Integer> sortedHeights = new ArrayList<>(List.copyOf(heights));
        Collections.sort(sortedHeights);
        List<Integer> reversedHeights = new ArrayList<>(List.copyOf(sortedHeights));
        Collections.reverse(reversedHeights);
        if (heights.equals(sortedHeights)) {
            System.out.println(true);
        } else if (heights.equals(reversedHeights)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}