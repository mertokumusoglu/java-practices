package AdvancedCalculator;
import java.util.Scanner;

public class Main {
// funcs

    static void plus() {
        Scanner sc = new Scanner(System.in);
        int num, i = 1, result = 0;
        while (true) {
            System.out.print(i++ + ". number: ");
            num = sc.nextInt();

            if(num == 0) {
                break;
            }
            else {
                result += num;
            }
        }
        System.out.println("result: " + result);
    }

    static void extraction() {
        Scanner sc = new Scanner(System.in);
        int result = 0, i = 1, num;
        while (true) {
            System.out.print(i + ". number: ");
            num = sc.nextInt();

            if (i == 1) {
                result += num;
            }
            else if (num == 0) {
                break;
            }
            else {
                result -= num;
            }
            i++;
        }
        System.out.println(result);
    }
    static void multiply() {
        Scanner sc = new Scanner(System.in);
        int result = 1,i = 1,num;
        while (true) {
            System.out.print(i++ + ". number: ");
            num = sc.nextInt();
            if(num == 1) {
                break;
            }
            else {
                result *= num;
            }
        }
        System.out.println("result: " + result);
    }
    static void divider() {
        Scanner sc = new Scanner(System.in);
        int num, i = 1;
        double result = 0.0;

        while (true) {
            System.out.print(i + ". number: ");
            num = sc.nextInt();

            if(num == 1) {
                break;
            }
            else if (num == 0) {
                System.out.println("You cannot divide a number by 0");
                break;
            }
            else if (i == 1) {
                result += num;
            }
            else {
                result /= num;
            }
            i++;
        }
        System.out.println("result: " + result);
    }
    static void exp() {
        Scanner sc = new Scanner(System.in);
        int base, exp, result = 1;

        System.out.print("Enter base number: ");
        base = sc.nextInt();
        System.out.print("Enter exp number: ");
        exp = sc.nextInt();

        for(int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("result: " + result);
    }
    static void factorial() {
        Scanner sc = new Scanner(System.in);
        int num, result = 0;

        System.out.print("Enter the number you want to get the factorial: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("result: " + result);
    }
    static void getMode() {
        Scanner sc = new Scanner(System.in);
        int num1,num2,result = 1;

        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        if(num2 == 0) {
            System.out.println("You cannot divide a number by 0");
        }
        else if(num1 == 0) {
            System.out.println("You cannot divide 0 by any number");
        }
        else {
            result = num1 % num2;
        }
        System.out.println("result: " + result);
    }
    static void rectangleAreaPerimeterCalculate() {
        Scanner sc  = new Scanner(System.in);
        int shortEdge,longEdge,perimeter = 0,area = 1;

        System.out.print("Enter short edge: ");
        shortEdge = sc.nextInt();
        System.out.print("Enter long edge: ");
        longEdge = sc.nextInt();

        if (shortEdge == 0 || longEdge == 0) {
            System.out.print("wrong data");
        }
        else {
            perimeter =  shortEdge*2 + longEdge*2;
            area = shortEdge * longEdge;
        }
        System.out.println("perimeter is: " + perimeter);
        System.out.println("area is: " + area);
    }

//main

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;

        String menu = "\n1-Plus" +
                "\n2-Extraction" +
                "\n3-Multiply" +
                "\n4-Divide" +
                "\n5-Exponential number calculator" +
                "\n6-Factorial calculator" +
                "\n7-Getting mode" +
                "\n8-Rectangle area-perimeter calculator" +
                "\n0-Quit" +
                "\nWhat action do you want? ";
        do {
        System.out.println(menu);
        select = sc.nextInt();

            switch(select) {
                case 1:
                    plus();
                    break;
                case 2:
                    extraction();
                    break;
                case 3:
                    multiply();
                case 4:
                    divider();
                case 5:
                    exp();
                case 6:
                    factorial();
                case 7:
                    getMode();
                case 8:
                    rectangleAreaPerimeterCalculate();
                case 0:
                    break;
            }
        } while (select != 0);
    }
}