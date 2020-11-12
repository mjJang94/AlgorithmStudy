import java.util.*;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int size = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }

        //Arrays.sort() 는 테스트 케이스에서 시관 초과가 나기 때문에 Collections 의 sort를 이용했다.
        Collections.sort(list);

        for(int value: list){
            stringBuilder.append(value).append('\n');
        }

        System.out.println(stringBuilder);
    }
}
