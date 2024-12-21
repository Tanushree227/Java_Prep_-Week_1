public class Problem_2{
    public static void main(String[] args) {
        double tuition = 50000; // Initial tuition fee in Rs
        double rate = 0.05; // Annual increase rate (5%)

        System.out.println("Year\tTuition Fee (Rs)");

        // Loop to calculate and display tuition fee for 10 years
        for (int year = 1; year <= 10; year++) {
            System.out.printf("%d\t%.2f\n", year, tuition);
            tuition += tuition * rate; // Increase tuition by 5%
        }
    }
}
