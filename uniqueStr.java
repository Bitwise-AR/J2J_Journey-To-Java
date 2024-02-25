import java.util.Scanner;

public class uniqueStr {

    public static int firstUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currchar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int result = firstUnique(input);
        if (result != -1) {
            System.out.println("First unique character found at index: " + result);
        } else {
            System.out.println("No unique character found in the string.");
        }
        sc.close();
    }
}
