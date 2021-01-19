import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(stream.readLine(), " ");

        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());


        stream.close();

        StringBuilder stringBuilder = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> tmpQueue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        stringBuilder.append("<");


        for (int i = 1; i <= N; i ++){

            for (int j = 1; j <= K; j ++){

                if (j % K == 0){
                   tmpQueue.add(queue.poll());
                }
                else{
                   queue.add(queue.poll());
                }
            }
        }


        for(int i = 1; i <= N; i++){
            stringBuilder.append(tmpQueue.poll());

            if (i != N) {
                stringBuilder.append(", ");
            }
        }

        stringBuilder.append(">");

        System.out.println(stringBuilder.toString());
    }
}
