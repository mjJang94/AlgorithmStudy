import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        gugudan(N);

    }

    static void gugudan(int stage) {

        for (int i = 1; i < 10; i++) {
            int multiple = stage * i;
            System.out.println(stage + " " + "*" + " " + i + " " + "=" + " " + multiple);
        }
    }
}
