import java.util.Scanner;

public class TrickyArray {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("New Array : ");
        for(int i=0;i<n;i++){
            sum -= arr[i];
            arr[i] = sum;
            System.out.print(arr[i] + " ");
        }
    }
}