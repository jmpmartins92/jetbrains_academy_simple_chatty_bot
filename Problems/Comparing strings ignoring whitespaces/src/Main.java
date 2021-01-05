import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().replaceAll(" ","").trim();
        String str2 = scanner.nextLine().replaceAll(" ","").trim();
        if (str1.equals(str2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}