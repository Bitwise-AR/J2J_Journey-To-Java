import java.util.Arrays;
import java.util.Scanner;

/*
 * make array
 * return the user wether there is any duplicate ele or not
 */

public class Duplicate {
    boolean check(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    boolean check2(int arr[]){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Duplicate obj = new Duplicate();

        if(obj.check(arr)){
            System.out.println("Duplicate element found!");
        }
        else {
            System.out.println("No duplicate element found!");
        }
        sc.close();
    }
}
