package FibonacciSequence;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 1,n3;

        System.out.print("Dizinin kaç elemanlı olmasını istediğini giriniz: ");
        int num = sc.nextInt();

        System.out.print(n1 + " " +n2);
        for(int i = 2; i < num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }
}
