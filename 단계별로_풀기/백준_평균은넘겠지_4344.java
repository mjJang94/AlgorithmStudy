import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = reader.readLine();
        }

        reader.close();

        for (String s : arr) {

            StringTokenizer st = new StringTokenizer(s);

            int total = Integer.parseInt(st.nextToken());
            double sum = 0;
            int[] scores = new int[total];
            int index = 0;

            while (st.hasMoreTokens()) {
                int tmpScore = Integer.parseInt(st.nextToken());
                scores[index] = tmpScore;
                sum += tmpScore;
                index++;
            }

            double avg = sum / total;
            double overAvg = 0;

            for (int score : scores) {
                if (score > avg) {
                    overAvg++;
                }
            }
              System.out.printf("%.3f%%\n", (overAvg/total) * 100);
        }
    }
}
