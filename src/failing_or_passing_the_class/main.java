package failing_or_passing_the_class;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int math, physics, turkish, history, chemistry;

    System.out.println("Please enter score between 0 and 100");

    System.out.printf("Please enter a math score: ");
    math = sc.nextInt();

    System.out.printf("Please enter a physics score: ");
    physics = sc.nextInt();

    System.out.printf("Please enter a history score: ");
    history = sc.nextInt();

    System.out.printf("Please enter a turkish score: ");
    turkish = sc.nextInt();

    System.out.printf("Please enter a chemistry score: ");
    chemistry = sc.nextInt();

    if (math > 100 || math < 0) {
        math = 0;
    }
    if (physics > 100 || physics < 0) {
        physics = 0;
    }
    if (history > 100 || history < 0) {
        history = 0;
    }
    if (chemistry > 100 || chemistry < 0) {
        chemistry = 0;
    }
    if (turkish > 100 || turkish < 0) {
        turkish = 0;
    }
        double average = (math + turkish + chemistry + physics + history) / 5;
        if (average >= 55 ) {
            System.out.printf("Congrulations you passed the class, your average: " + average);
        }
        if (average < 55) {
            System.out.printf("We_re sorry you failed the class, your average: " + average);
        }
    }
}
