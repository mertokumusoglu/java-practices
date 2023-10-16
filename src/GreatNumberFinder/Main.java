package GreatNumberFinder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        if(num == sum) {
            System.out.println(num + " Sayısı bir mükemmler sayıdır.");
        }
        else {
            System.out.println(num + " Sayısı bir mükemmler sayı değildir.");
        }
    }
}

