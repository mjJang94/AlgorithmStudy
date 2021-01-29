import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(solve(scanner.next()));
        }
    }

    public static String solve(String value) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < value.length(); i++) {

            char c = value.charAt(i);

            if (c == '(') {
                stack.push('(');
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
