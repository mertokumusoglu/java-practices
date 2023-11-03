package DuplicatedEvenNumbers;
import java.util.Arrays;

public class Main {
    public static boolean isFind(int[] arr, int value) {
        for(int i : arr) {
            if( i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3,7,3,12,2,9,10,12,1,10,9,1};
        int[] duplicate = new int[list.length];
        int index = 0;

        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if(list[i] % 2 == 0) {
                        if(!isFind(duplicate, list[i])) {
                            duplicate[index++] = list[i];
                        }
                    }
                }
            }
        }

        for(int i : duplicate){
            if(i != 0) {
                System.out.println(i);
            }
        }


    }
}
