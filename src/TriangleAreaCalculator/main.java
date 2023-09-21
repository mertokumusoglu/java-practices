package TriangleAreaCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int length1,length2,length3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side lengths of the triange: ");
        length1 = sc.nextInt();
        length2 = sc.nextInt();
        length3 = sc.nextInt();

        double perimeter = length1 + length2 + length3;
        double u = perimeter/2;
        double area = Math.sqrt((u) * (u-length1) * (u-length2) * (u-length3));

        System.out.println("perimeter of triange: " + perimeter);
        System.out.println("area of triangle: " + area);
    }
}
