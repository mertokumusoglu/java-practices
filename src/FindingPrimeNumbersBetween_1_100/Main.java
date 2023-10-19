package FindingPrimeNumbersBetween_1_100;

public class Main {
    public static void main(String[] args) {
        for(int m = 2; m <= 100; m++) {
            int check = 0;
            for(int n = 2; n < m; n++) {
                if(m % n == 0) {
                    check = 1;
                }
            }
            if(check == 0) {
                System.out.println(m);
            }
        }
    }
}
