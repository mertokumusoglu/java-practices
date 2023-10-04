package HarmonicNumbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int numb = sc.nextInt();
        int i = 1;
        double result = 0.0;
        while(i <= numb) {
            result += (1.0/i);
            i++;
        }
        System.out.println(result);
    }
}
