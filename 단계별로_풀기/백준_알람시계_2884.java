import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        scanner.close();


        //시간에 지장을 주는 경우
        if (min < 45) {
            hour--;
            min = 60 - (45 - min);

            if (hour < 0) {
                hour = 23;
            }

            System.out.printf("%d %d", hour, min);
        } else {
            System.out.printf("%d %d", hour, min - 45);
        }
    }
}
