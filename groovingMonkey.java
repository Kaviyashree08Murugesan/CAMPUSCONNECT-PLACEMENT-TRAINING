import java.util.*;

public class GroovingMonkey {
    //Grooving Monkeys problem


    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] monkeys = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            monkeys[i] = sc.nextInt();
        }

        long answer = 1;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                int current = i;
                int cycleLength = 0;

                while (!visited[current]) {
                    visited[current] = true;
                    current = monkeys[current] - 1;
                    cycleLength++;
                }

                answer = lcm(answer, cycleLength);
            }
        }

        System.out.println(answer);

        sc.close();
    }
}