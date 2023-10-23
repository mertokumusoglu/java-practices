package PowWithRecursive;
import java.util.Scanner;

public class Main {
    static int pow(int x,int n) {
       if (n == 0) {
           return 1;
       }
       else {
           return x * pow(x,n - 1);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int x = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int n = sc.nextInt();

        System.out.println(pow(x,n));
    }
}
