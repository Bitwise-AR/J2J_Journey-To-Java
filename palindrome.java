import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = s.nextInt();
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }   
        String result = num == rev ? "Palindrome" : "Not Palindrome";
        System.out.println("The number is "+result+".");
        s.close();

    }
}
