package TaximeterCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double km_ucret = 2.20, minimum_tutar = 20, normal_tutar;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Kaç kilometre: ");
        int km = sc.nextInt();
        normal_tutar = 10 + (km_ucret*km);

        double tutar = normal_tutar > minimum_tutar ? normal_tutar : minimum_tutar;

        System.out.println("Ücret: " + tutar);
    }
}
