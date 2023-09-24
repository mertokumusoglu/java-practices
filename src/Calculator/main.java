package Calculator;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int a,b,n,result;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Lütfen birinci sayıyı giriniz: ");
        a = sc.nextInt();
        System.out.printf("Lütfen ikinci sayıyı giriniz: ");
        b = sc.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");

        n =sc.nextInt();

        switch (n) {
            case 1:
                result = a + b;
                System.out.println(a + " ve " + b + " sayılarının toplamı: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println(a + " ve " + b + " sayılarının farkı: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println(a + " ve " + b + " sayılarının çarpımı: " + result);
                break;
            case 4:
                switch (b) {
                    case 0:
                        System.out.println("Bir sayı 0 a bölünemez.");
                        break;
                    default:
                        result = a / b;
                        System.out.println(a + " sayısının " + b + " sayısına bölümü: " +result);
                        break;
                }
        }
    }
}
