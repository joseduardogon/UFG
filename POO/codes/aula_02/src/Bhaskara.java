import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("On ax^2 + bx + c = 0, enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        double x1 = 0;
        double x2 = 0;
        if ( a != 0) {
            double delta = (b * b) - (4 * a * c);
            x1 = b * -1;
            x2 = x1;
            x1 = x1 + delta;
            x2 = x2 - delta;
            x1 = x1 / (2 * a);
            x2 = x2 / (2 * a);
        } else if (b != 0) {
            x1 = c * -1;
            x1 = x1 / b;
            x2 = x1;
        } else {
            x1 = c * -1;
            x2 = x1;
        }
        System.out.printf("x1 = %.2f\nx2 = %.2f\n", x1, x2);
    }
}
