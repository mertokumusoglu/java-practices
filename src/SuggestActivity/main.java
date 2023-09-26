package SuggestActivity;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a temperature: ");
        double temperature = sc.nextDouble();

        if (5 >= temperature) {
            System.out.println("You can ski");
        }
        else if (15 >= temperature && temperature > 5) {
            System.out.println("You can go to the cinema");
        }
        else if (25 >= temperature && temperature > 15) {
            System.out.println("You can have a picnic");
        }
        else if (temperature > 25) {
            System.out.println("You can go to the swim");
        }

    }
}
