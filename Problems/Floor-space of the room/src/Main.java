import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shape = scan.next();
        switch (shape) {
            case "triangle":
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                double c = scan.nextDouble();
                double s = (a + b + c) / 2;
                double areaTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(areaTriangle);
                break;
            case "rectangle":
                double d = scan.nextDouble();
                double e = scan.nextDouble();
                double areaRectangle = d * e;
                System.out.println(areaRectangle);
                break;
            case "circle":
                double r = scan.nextDouble();
                double areaCircle = r * r * 3.14;
                System.out.println(areaCircle);
                break;
            default:
                System.out.println("not valid shape");
                break;
        }
    }
}