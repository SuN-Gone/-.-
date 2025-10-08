import java.util.Scanner;

public class Lab2n6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите параметр a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите параметр b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double y = calculateFunction(x, a, b);

        System.out.println("При x = " + x + ", a = " + a + ", b = " + b);
        System.out.println("y = " + y);

        scanner.close();
    }

    public static double calculateFunction(double x, double a, double b) {
        if (x <= -1) {
            return a * Math.tan(x * x);
        } else {
            return b + (x * x) / (x * x + a);
        }
    }
}
