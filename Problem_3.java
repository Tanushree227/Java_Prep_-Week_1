import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        // Accept the distance traveled and fuel used
        try (Scanner scanner = new Scanner(System.in)) {
            // Accept the distance traveled and fuel used
            System.out.print("Enter the distance traveled (in kilometers): ");
            double distanceTraveled = scanner.nextDouble();
            
            System.out.print("Enter the quantity of fuel used (in liters): ");
            double fuelUsed = scanner.nextDouble();
            
            // Calculate the average fuel economy (km/l)
            if (fuelUsed <= 0) {
                System.out.println("Fuel used must be greater than 0.");
                return;
            }
            
            double averageFuelEconomy = distanceTraveled / fuelUsed;
            System.out.printf("Average Fuel Economy: %.2f km/l\n", averageFuelEconomy);
            
            // Perform fuel estimation
            System.out.print("Enter the distance for fuel estimation (in kilometers): ");
            double estimationDistance = scanner.nextDouble();
            
            double estimatedFuel = estimationDistance / averageFuelEconomy;
            System.out.printf("Estimated fuel needed for %.2f km: %.2f liters\n", estimationDistance, estimatedFuel);
            
            // Perform distance estimation
            System.out.print("Enter the fuel quantity for distance estimation (in liters): ");
            double estimationFuel = scanner.nextDouble();
            
            double estimatedDistance = estimationFuel * averageFuelEconomy;
            System.out.printf("Estimated distance that can be traveled with %.2f liters: %.2f km\n", estimationFuel, estimatedDistance);
        }
    }
}
