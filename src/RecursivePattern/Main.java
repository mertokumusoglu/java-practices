package RecursivePattern;
import java.util.Scanner;

public class Main {
    static void patMinus(int a, int temp) {
        if(a > 0) {
            System.out.print(a + " ");
            patMinus(a - 5,temp);
        }
        else if(a <= 0) {
            patPlus(a, temp);
        }
    }
    static void patPlus(int a, int temp) {
        if (temp >= a) {
            System.out.print(a + " ");
            patPlus(a + 5, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = sc.nextInt();
        int temp = a;
        patMinus(a, temp);
    }
}
