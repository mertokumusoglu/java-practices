package PalindromeNumberFinder;

public class Main {
    static boolean isPalindrom(int num) {
        int temp = num, reverseNum = 0,lastNum;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        if (num == reverseNum) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}
