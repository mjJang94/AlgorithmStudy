import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        scan.close();

        Queue<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            list.poll();
            list.add(list.poll());
        }

        System.out.println(list.peek());
    }
}
