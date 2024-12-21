import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        // Accept loan amount and loan period from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Accept loan amount and loan period from the user
            System.out.print("Enter the loan amount: ");
            double loanAmount = scanner.nextDouble();
            
            System.out.print("Enter the loan period (in years): ");
            int loanPeriod = scanner.nextInt();
            
            // Display header for the table
            System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
            
            // Loop through interest rates from 5% to 8% with increments of 1/8
            for (double annualRate = 5.0; annualRate <= 8.0; annualRate += 0.125) {
                double monthlyRate = annualRate / 1200; // Convert annual rate to monthly
                int totalMonths = loanPeriod * 12;
                
                // Calculate monthly payment using the loan formula
                double monthlyPayment = (loanAmount * monthlyRate) /
                        (1 - Math.pow(1 + monthlyRate, -totalMonths));
                
                // Calculate total payment
                double totalPayment = monthlyPayment * totalMonths;
                
                // Display the interest rate, monthly payment, and total payment
                System.out.printf("%.3f%%\t\tRs %.2f\t\tRs %.2f\n", annualRate, monthlyPayment, totalPayment);
            }
        }
    }
}
