package MinMaxFinder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = sc.nextInt();
        while(n > 0) {
            for(int i  = 1; i <= n; i++) {
                System.out.print(i + ". Sayıyı giriniz: ");
                int m = sc.nextInt();

                if(m > max) {
                    max = m;
                }
                if (m < min) {
                    min = m;
                }
            }
        break;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
