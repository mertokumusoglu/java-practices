package AddingDigits;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = sc.nextInt();
        int result = 0;

        while (number != 0 ) {
            int digitValue = number % 10;
            result += digitValue;
            number /= 10;
        }
        System.out.println(result);
    }
}
