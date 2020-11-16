import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /**
     * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
     * <p>
     * 길이가 짧은 것부터
     * 길이가 같으면 사전 순으로
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = bufferedReader.readLine();
        }

        //글자수 및 알파벳순 정렬
        Arrays.sort(arr, (o1, o2) -> {
            //글자수가 같으면 알파벳 비교
            if (o1.length() == o2.length()){
                return o1.compareTo(o2);
            }

            //글자수로 비교
            return o1.length() - o2.length();
        });

        //중복 제거하며 list로 변환
        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : arr) {
            if (!arrayList.contains(s)) {
                arrayList.add(s);
            }
        }

        //문자열 이어주기
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : arrayList) {
            stringBuilder.append(s);
            stringBuilder.append('\n');
        }

        System.out.println(stringBuilder);
    }
}
