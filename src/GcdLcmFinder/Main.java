package GcdLcmFinder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int n1 = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = sc.nextInt();
        int i = n1;
        int ebob = 1;
        int ekok = 1;

        //ebob
        while(i > 0) {
            if(n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println(n1 + " ve " + n2 + " Sayılarının ebobu: "+  ebob);
                break;
            }
            i--;
        }
        //ekok
        int m  = n2;
        while (m <= n1*n2) {
            if(m % n1 == 0 && m % n2 == 0) {
                ekok = m;
                System.out.println(n1 + " ve " + n2 + " Sayılarının ekoku: "+  ekok);
                break;
            }
            m++;
        }
    }
}