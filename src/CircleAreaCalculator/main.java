package CircleAreaCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int radius, central_angle;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter radius of a circle: ");
        radius = sc.nextInt();
        System.out.printf("Please enter central angle of a circle: ");
        central_angle = sc.nextInt();
        //calculate area pi = 3.14

        double area = (3.14 * (radius*radius) * central_angle) / 360;
        System.out.printf("area of the circle: " + area);
    }
}
