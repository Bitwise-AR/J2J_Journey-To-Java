import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]) {
        int row, col, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows for the pattern: ");
        n = s.nextInt();
        for (row = 0; row < n; row++) {
            for (col = n - row; col > 1; col--) {
                System.out.print(" ");
            }
            for (col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}