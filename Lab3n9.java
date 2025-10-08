import java.util.Scanner;

public class Lab3n9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x (-1 ≤ x < 1): ");
        double x = scanner.nextDouble();

        if (x < -1 || x >= 1) {
            System.out.println("Ошибка: ряд сходится только при -1 ≤ x < 1");
            return;
        }

        System.out.print("Введите точность ε: ");
        double epsilon = scanner.nextDouble();

        double sum = calculateSeriesSum(x, epsilon);

        System.out.println("Сумма ряда S = " + sum);

        scanner.close();
    }

    public static double calculateSeriesSum(double x, double epsilon) {
        double sum = 0.0;
        double term;
        int n = 1;
        double harmonicSum = 0.0;
        double xPower = x * x;

        do {
            harmonicSum += 1.0 / n;

            term = harmonicSum * xPower / (n + 1);
            sum += term;

            xPower *= x;
            n++;

        } while (Math.abs(term) >= epsilon && n < 10000);

        return 2 * sum;
    }
}
