import java.util.Scanner;

public class MaxOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a : ");
        double a = scanner.nextDouble();
        System.out.println("b : ");
        double b = scanner.nextDouble();
        System.out.println("c : ");
        double c = scanner.nextDouble();
        double max = findMax(a, b, c);
        System.out.printf("The maximum of %.2f, %.2f and %.2f is: %.2f\n", a, b, c, max);
    }

    public static double findMax(double x, double y, double z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }
}
