package PalindromicWord;

import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int m = 0, n = str.length() - 1;
        while (m < n) {
            if(str.charAt(m) != str.charAt(n)) {
                return false;
            }
            m++;
            n--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palindromik olup olmadığını merak ettiğiniz kelimeyi giriniz: ");
        String word = sc.nextLine();
        System.out.println(isPalindrome(word));
    }
}