package PowCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Üssünü almak istediğiniz sayıyı giriniz: ");
        n = sc.nextInt();
        System.out.printf("Kaçıncı üssünü almak istediğinizi giriniz: ");
        r = sc.nextInt();
        int total = 1;
        for(int i = 1; i <= r; i++) {
            total= total*n;
        }
        System.out.println(total);

    }
}
