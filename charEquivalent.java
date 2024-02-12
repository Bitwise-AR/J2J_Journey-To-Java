import java.util.Scanner;
public class charEquivalent {
    public static void main (String [] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner (System.in);
        int num;
        num = sc.nextInt ();
        sc.close ();
        char ch = (char) num;

        System.out.println ("The character quivalent of the number " + num + " is " + ch);
    }
}
