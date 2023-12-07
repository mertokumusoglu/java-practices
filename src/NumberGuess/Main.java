package NumberGuess;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = random.nextInt(1,100);

        while (result == 0) {
            System.out.print("Lütfen 1 ile 100 arasında bir sayı giriniz: ");
            int selected = sc.nextInt();

            if (selected == num) {
                result = 1;
                System.out.println("Sayıyı doğru tahmin ettiniz => " + num);
            }
            else {
                if (selected > num) {
                    System.out.println("Lütfen daha küçük bir sayı giriniz.");
                }
                else if (selected < num) {
                    System.out.println("Lütfen daha büyük bir sayı giriniz.");
                }
            }
        }
    }
}
