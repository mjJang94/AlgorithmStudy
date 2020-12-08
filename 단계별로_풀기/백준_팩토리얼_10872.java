import java.util.Scanner;

public class Main {

    /**
     * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
     *
     * 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
     *
     * 첫째 줄에 N!을 출력한다.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextInt();
        scanner.close();

        System.out.print(recursiveFactorial(value));
    }

    public static long recursiveFactorial(long value){

        if(value <= 1) return 1;
        return value * recursiveFactorial(value -1);
    }
}
