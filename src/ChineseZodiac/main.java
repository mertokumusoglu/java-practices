package ChineseZodiac;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int year,odd;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Lütfen hangi yılda doğdunuzu giriniz: ");
        year = sc.nextInt();

        odd = year % 12;
        switch (odd) {
            case 0:
                System.out.printf("Çin zodyağı burcunuz: Maymun");
                break;
            case 1:
                System.out.printf("Çin zodyağı burcunuz: Horoz");
                break;
            case 2:
                System.out.printf("Çin zodyağı burcunuz: Köpek");
                break;
            case 3:
                System.out.printf("Çin zodyağı burcunuz: Domuz");
                break;
            case 4:
                System.out.printf("Çin zodyağı burcunuz: Fare");
                break;
            case 5:
                System.out.printf("Çin zodyağı burcunuz: Öküz");
                break;
            case 6:
                System.out.printf("Çin zodyağı burcunuz: Kaplan ");
                break;
            case 7:
                System.out.printf("Çin zodyağı burcunuz: Tavşan");
                break;
            case 8:
                System.out.printf("Çin zodyağı burcunuz: Ejderha");
                break;
            case 9:
                System.out.printf("Çin zodyağı burcunuz: Yılan");
                break;
            case 10:
                System.out.printf("Çin zodyağı burcunuz: At");
                break;
            case 11:
                System.out.printf("Çin zodyağı burcunuz: Koyun");
                break;
        }
    }
}
