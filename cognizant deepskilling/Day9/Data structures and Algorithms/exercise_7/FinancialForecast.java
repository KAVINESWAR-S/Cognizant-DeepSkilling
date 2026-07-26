import java.util.Scanner;

public class FinancialForecast {
    static double futureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Present Value : ");
        double present = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (%): ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Enter Number of Years : ");
        int years = sc.nextInt();

        double result = futureValue(present, rate, years);

        System.out.printf("\nFuture Value = %.2f", result);

        sc.close();
    }
}