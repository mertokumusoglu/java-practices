package ReverseTriangleWithStars;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("Ters üçgenin kaç basamaklı olmasını istediğini giriniz: ");
        int n= inp.nextInt();
        for (int i=n;i>=1;i--){
            System.out.println(" ");
            for (int l=0;l<=n-i;l++) {
                System.out.print(" ");
            }
            for (int j = 1; (j <= ((2 * i) - 1)); j++) {
                System.out.print("*");
            }
        }
    }
}