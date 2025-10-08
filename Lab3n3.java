import java.util.Scanner;

public class Lab3n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x (-1 < x < 1): ");
        double x = scanner.nextDouble();

        if (Math.abs(x) >= 1) {
            System.out.println("Ошибка: ряд сходится только при -1 < x < 1");
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
        int n = 0;
        double xFourth = Math.pow(x, 4);
        double xPower = x;

        do {
            term = xPower / (4 * n + 1);
            sum += term;

            xPower *= xFourth;
            n++;
        } while (Math.abs(term) >= epsilon && n < 1000);

        System.out.println("Количество итераций: " + n);
        return sum;
    }
}