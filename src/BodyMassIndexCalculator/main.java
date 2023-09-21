package BodyMassIndexCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Lütfen boyunuzu giriniz (m): ");
        double boy = sc.nextDouble();
        System.out.printf("Lütfen kilonuzu giriniz: ");
        int kilo = sc.nextInt();

        double index = kilo / (boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + index);
    }
}
