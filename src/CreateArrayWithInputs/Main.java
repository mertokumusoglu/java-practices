package CreateArrayWithInputs;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = sc.nextInt();
        int index = 0;

        int[] arr = new int[boyut];
        for(int i = 1; i <= arr.length; i++) {
            System.out.print(i + ". Elemanı: ");
            int num = sc.nextInt();
            arr[index++] = num;
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
