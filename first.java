import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int sum = a + b + c;
        System.out.println("The sum of the numbers is: " + sum);
    }
}