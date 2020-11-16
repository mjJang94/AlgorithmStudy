import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] aar = new int[N][2];

        for (int i = 0; i < N; i++) {

            aar[i][0] = scanner.nextInt();
            aar[i][1] = scanner.nextInt();
        }

        Arrays.sort(aar, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(aar[i][0] + " " + aar[i][1]);
        }
    }
}
