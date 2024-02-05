import java.util.Scanner;

public class average {
    int avg(int arr[]){
        int s = 0;
        for(int i = 0;i<arr.length;i++){
            s+=arr[i];
        }
        return (s/arr.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        average obj = new average();
        System.out.println("Avg of the given arr is "+obj.avg(arr));
        sc.close();
    }
}
