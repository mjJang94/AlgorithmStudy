import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] stack;
    private static int size = 0;
    private static StringBuffer stringBuffer;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        stringBuffer = new StringBuffer();
        stack = new int[N];

        while (N-- > 0){

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            switch (stringTokenizer.nextToken()) {

                case "push":
                    add(Integer.parseInt(stringTokenizer.nextToken()));
                    break;


                case "pop":
                    pop();
                    break;

                case "size":
                    size();
                    break;


                case "empty":
                    empty();
                    break;

                case "top":
                    top();
                    break;
            }

        }

        System.out.println(stringBuffer.toString());

    }

    private static void add(int value) {
        stack[size] = value;
        size++;
    }

    private static void pop() {

        if (size == 0) {
            stringBuffer.append(-1).append("\n");

        } else {

            int tmp = stack[size - 1];
            stack[size - 1] = 0;
            size--;

            stringBuffer.append(tmp).append("\n");
        }
    }

    private static void size() {
        stringBuffer.append(size).append("\n");
    }

    private static void empty() {
        if (size == 0) {
            stringBuffer.append(1).append("\n");
        } else {
            stringBuffer.append(0).append("\n");
        }
    }

    private static void top() {
        if (size == 0) {
            stringBuffer.append(-1).append("\n");
        } else {
            stringBuffer.append(stack[size - 1]).append("\n");
        }
    }
}
