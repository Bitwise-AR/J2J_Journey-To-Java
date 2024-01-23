import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd: ");
        num = s.nextInt();
        String result = (num % 2) == 0 ? "Even" : "Odd";
        // String result = (num & 1) == 0 ? "Even" : "Odd";
        // String result = (num >> 1) << 1 == num ? "Even" : "Odd";
        s.close();
        System.out.println("The number is " + result);
        

    }
} 