import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr= new int[10];
        StringBuilder stringBuilder = new StringBuilder();
        long tmpMultipleResult = Integer.parseInt(bufferedReader.readLine()) * Integer.parseInt(bufferedReader.readLine()) * Integer.parseInt(bufferedReader.readLine());

        String multipleResult = String.valueOf(tmpMultipleResult);


        for (int i = 0; i < multipleResult.length(); i++){

            // char table 참고, 0이 48부터 시작
            // 48 - 48 = 0, 즉 0의 출현 빈도가 들어갈 arr[0]의 값을 증가

            arr[(multipleResult.charAt(i) - 48)]++;
        }


        for (int appearCount: arr){
            System.out.println(appearCount);
        }

    }
}
