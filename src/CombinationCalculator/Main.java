package CombinationCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        double total;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Hangi sayının kombinasyonunu istiyorsunuz: ");
        n = sc.nextInt();
        System.out.printf("Kaçlı kombinasyonunu istiyorsunuz: ");
        r = sc.nextInt();

        int n_factorial = 1;
        for(int i = 1; i <= n; i++) {
            n_factorial *= i;
        }
        int r_factorial = 1;
        for(int i = 1; i <= r; i++) {
            r_factorial *= i;
        }
        int difference_factorial = 1;
        for(int i = 1; i <= (n-r); i++) {
            difference_factorial *= i;
        }
        total = n_factorial / (r_factorial*difference_factorial);
        System.out.println(n_factorial);
        System.out.println(r_factorial);
        System.out.println(total);

    }
}
