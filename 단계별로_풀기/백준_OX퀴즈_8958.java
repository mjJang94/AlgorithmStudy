import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String arr[] = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = reader.readLine();
        }
        reader.close();

        for (int i = 0; i < arr.length; i++) {

            int result = 0;
            int correctCounter = 0;

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) != 'O') {
                    correctCounter = 0;
                }else{
                    correctCounter++;
                }
                result += correctCounter;
            }
            System.out.println(result);
        }
    }
}
