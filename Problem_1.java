import java.util.Scanner;

public class Problem_1
{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        double height = sc.nextDouble();
        double meter = height / 100.0;
        double bmi = (double) weight / (meter * meter);
        System.out.println("BMI: " +bmi);
        if(bmi < 18.5)
        {
            System.out.println("Underweight");
        }
        else if(bmi > 18.5 && bmi <= 24.9)
        {
            System.out.println("Normal");
        }
        else if(bmi > 24.9 && bmi <= 29.9)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }
    }
}