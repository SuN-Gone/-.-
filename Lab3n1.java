import java.util.Scanner;

public class Lab3n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите точность ε: ");
        double epsilon = scanner.nextDouble();

        double sum = calculate(x, epsilon);

        System.out.println("Сумма ряда S = " + sum);

        scanner.close();
    }

    public static double calculate(double x, double epsilon) {
        double sum = 0.0;
        double term;
        int n = 1;

        do {

            term = Math.pow(-1, n) * (2 * n * Math.pow(x, 2 * n + 1)) / factorial(2 * n + 1);
            sum += term;
            n++;
        } while (Math.abs(term) >= epsilon && n < 1000); // ограничение на количество итераций

        return sum;
    }

    public static double factorial(int n) {
        double result = 1.0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
