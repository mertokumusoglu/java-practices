package AverageWithLoops;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int sayi,sayac = 0,toplam = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Bir sayı giriniz: ");
        sayi = sc.nextInt();

        for(int i = 1; i < sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac+=1;
            } else {
                continue;
            }
        }
        System.out.println(toplam/sayac);
    }
}
