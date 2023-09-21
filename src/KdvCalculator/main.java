package KdvCalculator;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double kdv, price_with_kdv;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a price: ");
        double price = sc.nextDouble();

        kdv = (price >= 1000) ? 0.18 : 0.8;
        price_with_kdv = price + (price * kdv);

        System.out.println("Price with kdv is: " + price_with_kdv);
        System.out.println("Price of kdv is: " + kdv);
        }
    }
