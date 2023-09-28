package AddingEvens;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi = 0, toplam = 0;

        Scanner sc = new Scanner(System.in);

        while(sayi % 2 == 0) {
            System.out.printf("Bir sayı giriniz: ");
            sayi = sc.nextInt();

            if(sayi % 4 == 0) {
                toplam += sayi;
                continue;
            }
            else {continue;}
        }
        System.out.println(toplam);
    }
}