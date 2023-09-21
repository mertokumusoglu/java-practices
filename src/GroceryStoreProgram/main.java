package GroceryStoreProgram;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double kgArmut = 2.14,
                kgElma = 3.67,
                kgDomates = 1.11,
                kgMuz = 0.95,
                kgPatlıcan = 5.00;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Armut kaç kilo: ");
        double armut = sc.nextInt();
        System.out.printf("Elma kaç kilo: ");
        double elma = sc.nextInt();
        System.out.printf("Domates kaç kilo: ");
        double domates = sc.nextInt();
        System.out.printf("Muz kaç kilo: ");
        double muz = sc.nextInt();
        System.out.printf("Patlican kaç kilo: ");
        double patlican = sc.nextInt();

        double toplam = (armut*kgArmut)+(elma*kgElma)+(domates*kgDomates)+(muz*kgMuz)+(patlican*kgPatlıcan);
        System.out.println("Toplam ücret: " + toplam);
    }
}
