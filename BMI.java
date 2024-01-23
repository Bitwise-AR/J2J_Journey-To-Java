import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your height: ");
        double height = s.nextDouble();
        System.out.print("Enter weight : ");
        double weight = s.nextDouble();
        double bmi = weight / (height * height);

        String result = (bmi < 18) ? "Skinny" : (bmi >= 18 && bmi < 22) ? "Fit" : "Obese";

        s.close();
        System.out.println("Your BMI is: " + bmi);
        System.out.println("You are " + result);
    }
}
