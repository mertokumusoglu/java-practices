package ClosestNumberGtLtArray;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println(Arrays.toString(list));

        int min = list[0];
        int max = list[0];

        for(int i : list) {
            if( i < min) {
                min = i;
            }
        }
        for(int i : list) {
            if( i > max) {
                max = i;
            }
        }
        System.out.print("Bir sayı giriniz: ");
        int num = sc.nextInt();
        int min1 = 0;
        int max1 = 0;

        if(num < max && num > min) {
            System.out.println("girilen sayı: " + num);
            Arrays.sort(list);

            for( int i : list) {
                if (i > num) {
                    min1 = i;
                    break;
                }
            }
            for(int i = list.length - 1; i < list.length; i--) {
                if(list[i] < num) {
                    max1 = list[i];
                    break;
                }
            }
        }
        else {
            System.out.println("Girdiğiniz sayıyı liste sınırlarının dışında.");
        }
        System.out.println("Sayıdan küçük en büyük sayı: "+ max1);
        System.out.println("Sayıdan büyük en küçük sayı: "+ min1);
    }
}
