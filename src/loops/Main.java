package loops;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("multiples of 5");
        for(int i = 1; i <= n; i *= 4) {
         System.out.println(i);
        }
        System.out.println("multiples of 5");
        for(int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}
