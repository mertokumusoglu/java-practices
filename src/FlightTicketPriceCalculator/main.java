package FlightTicketPriceCalculator;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double distance, age, price;
        int trip_type;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Mesafeyi km türünden giriniz: ");
        distance = sc.nextDouble();
        if (distance <= 0) {
        System.out.println("Hatalı veri girdiniz.");
        } else {
            System.out.printf("Yaşınızı giriniz: ");
            age = sc.nextDouble();
            System.out.printf("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
            trip_type = sc.nextInt();

            if (trip_type == 1 || trip_type == 2) {
                switch (trip_type) {
                    case 1:
                        if (age < 12) {
                            price = (distance * 0.10) * 0.50;
                            System.out.println("Toplam tutar: " + price);
                        }
                        else if (age >= 12 && 24 > age) {
                            price = (distance * 0.10) - (distance * 0.10) * 0.10;
                            System.out.println("Toplam tutar: " + price);
                        }
                        else if (age >= 24 && 65 > age) {
                            price = (distance * 0.10);
                            System.out.println("Toplam tutar: " + price);
                        }
                        else if (age >= 65) {
                            price =  (distance * 0.10) - (distance * 0.10) * 0.30;
                            System.out.println("Toplam tutar: " + price);
                        }
                        break;
                    case 2:
                        if (age < 12) {
                            price =  (distance * 0.10) - ((distance * 0.10) * 0.50);
                            double total_price = 2 * (price - (price * 0.20));
                            System.out.println("Toplam tutar: " + total_price);
                        }
                        else if (age >= 12 && 24 > age) {
                            price = (distance * 0.10) - ((distance * 0.10) * 0.10);
                            double total_price = 2 * (price - (price * 0.20));
                            System.out.println("Toplam tutar: " + total_price);
                        }
                        else if (age >= 24 && 65 > age) {
                            price = (distance * 0.10);
                            double total_price = 2 * (price - (price * 0.20));
                            System.out.println("Toplam tutar: " + total_price);
                        }
                        else if (age >= 65) {
                            price =  (distance * 0.10) - ((distance * 0.10) * 0.30);
                            double total_price = 2 * (price - (price * 0.20));
                            System.out.println("Toplam tutar: " + total_price);
                        }
                }
            }
            else {
                System.out.println("Hatalı veri girdiniz");
            }
        }
    }
}