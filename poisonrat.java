import java.util.Scanner;

public class PoisionRat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bottles = sc.nextInt();

        int rats = 0;
        int power = 1;

        while (power < bottles) {
            power *= 2;
            rats++;
        }

        System.out.println(rats);

        sc.close();
    }
}