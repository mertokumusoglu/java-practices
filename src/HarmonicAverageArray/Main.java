package HarmonicAverageArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double result;
        double harmonicSerial = 0;
        int[] arr = {1,2,3};

        for(int i = 0; i < arr.length; i++) {
            harmonicSerial +=  1.0/arr[i];
        }

        result = arr.length / harmonicSerial;
        System.out.println(result);
    }
}
