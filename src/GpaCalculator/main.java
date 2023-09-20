package GpaCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sMath, sPhysics, sChemistry, sTurkish, sHistory, sMusic;
        // take the scores from user
        System.out.printf("Please enter math score: ");
        sMath = sc.nextInt();

        System.out.printf("Please enter physics score: ");
        sPhysics = sc.nextInt();

        System.out.printf("Please enter chemistry score: ");
        sChemistry = sc.nextInt();

        System.out.printf("Please enter turkish score: ");
        sTurkish = sc.nextInt();

        System.out.printf("Please enter history score: ");
        sHistory = sc.nextInt();

        System.out.printf("Please enter music score: ");
        sMusic = sc.nextInt();

        // avg calculation

        int alls = (sMath + sPhysics + sChemistry + sTurkish + sHistory + sMusic);
        double avg = alls/6.0;
        // avg calculated

        String result = (avg > 60.0) ? "your avg is: " + avg + "\n Congrulations you passed the class" :
                "your avg is: " + avg + "\n we're sorry, you didn't pass the class";
        System.out.print(result);
    }
}
