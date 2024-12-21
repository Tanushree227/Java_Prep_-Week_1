import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for hours worked and hourly rate
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter the hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        double grossPay;

        // Calculate gross pay based on criteria
        if (hoursWorked <= 40) {
            grossPay = hoursWorked * hourlyRate;
        } else {
            double overtimeHours = hoursWorked - 40;
            grossPay = (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
        }

        // Display the gross pay
        System.out.printf("Gross Pay: Rs %.2f\n", grossPay);

        scanner.close();
    }
}
