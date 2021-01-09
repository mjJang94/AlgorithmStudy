import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    /**
     * push X: 정수 X를 큐에 넣는 연산이다.
     * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * size: 큐에 들어있는 정수의 개수를 출력한다.
     * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
     * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        LinkedList<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer tokenizer;

        for (int i = 0; i < N; i++) {

            tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            switch (tokenizer.nextToken()) {

                case "push": {
                    queue.offer(Integer.valueOf(tokenizer.nextToken()));
                    break;
                }

                case "pop": {
                    Integer tmp = queue.poll();

                    if (tmp == null) {
                        stringBuilder.append("-1").append("\n");
                    } else {
                        stringBuilder.append(tmp).append("\n");
                    }
                    break;
                }

                case "size": {
                    stringBuilder.append(queue.size()).append("\n");
                    break;
                }

                case "empty": {

                    if (queue.isEmpty()) {
                        stringBuilder.append(1).append("\n");
                    } else {
                        stringBuilder.append(0).append("\n");
                    }
                    break;
                }

                case "front": {

                    Integer tmp = queue.peek();

                    if (tmp == null) {
                        stringBuilder.append(-1).append("\n");
                    } else {
                        stringBuilder.append(tmp).append("\n");
                    }
                    break;
                }

                case "back": {
                    Integer tmp = queue.peekLast();

                    if (tmp == null) {
                        stringBuilder.append(-1).append("\n");
                    } else {
                        stringBuilder.append(tmp).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
