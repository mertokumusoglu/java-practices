package DiamondWithStars;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Basamak sayısını giriniz: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int m = 0; m < (n-i); m++) {
                System.out.print(" ");
            }
            for(int z = 0; z < (2*i) - 1; z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i = 1; i <= n - 1; i++) {
            for(int m = 0; m < i; m++) {
                System.out.print(" ");
            }
            for(int z = (n - i) * 2 - 1; z > 0; z--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
