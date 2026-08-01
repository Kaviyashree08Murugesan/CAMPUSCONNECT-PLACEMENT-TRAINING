import java.util.Scanner;

public class Recursion {
    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        int result = fact(num);
        System.out.println("Factorial : " + result);
    }
}