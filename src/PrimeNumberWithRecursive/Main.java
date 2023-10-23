package PrimeNumberWithRecursive;
import java.util.Scanner;

public class Main {
    static boolean isPrime(int n, int m) {
            if(n < 2) {
                return false;
            }
            else if(n == 2) {
                return true;
            }
            else if(n % m == 0) {
                return false;
            }
            else if (m * m > n) {
                return true;
        }

        return isPrime(n, m + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = sc.nextInt();

        if (isPrime(n,2)) {
            System.out.println(n + " Asaldır");
        }
        else {
            System.out.println(n + " Asal değildir");
        }
    }
}
