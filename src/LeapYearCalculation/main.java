package LeapYearCalculation;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Yıl giriniz: ");
        year = sc.nextInt();

        if(year % 100 == 0) {
            if(year % 400 == 0) {
                System.out.printf(year + " bir artık yıldır");
            }
            else {
                System.out.printf(year + " bir artık yıl değildir");
            }
        }
        else {
            if(year % 4 == 0) {
                System.out.printf(year + " bir artık yıldır");
            }
            else {
                System.out.printf(year + " bir artık yıl değildir");
            }
        }
    }
}
