import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] arr;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        arr = new int[size];

        for (int i = 0; i < size; i++){
            int value = scanner.nextInt();
            arr[i] = value;
        }

        Arrays.sort(arr);

        printByArray(arr);
    }

    static void printByArray(int[] arr){

        for(int value : arr){
            System.out.println(value);
        }
    }

}
