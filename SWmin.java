import java.util.*;

public class SWMin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int winsum=0,result=0,i;

        System.out.println("Enter Array Elements : ");
        for (i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter K Value : ");
        int k=sc.nextInt();

        for(i=0;i<k;i++){
            winsum=winsum+arr[i];
            result=winsum;
        }
            
        for(i=k;i<n;i++){
            winsum+=arr[i]-arr[i-k];
            result =Math.min(result,winsum);
        }

        
        System.out.println("Minimum Sum Sub Array : " + result);
    }
}