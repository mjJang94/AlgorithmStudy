import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long fixCost = Long.parseLong(stringTokenizer.nextToken());
        long variableCost = Long.parseLong(stringTokenizer.nextToken());
        long productCost = Long.parseLong(stringTokenizer.nextToken());


        /**
         * productCost - variableCost < 0 이면 이익이 발생하지 않게 되는데
         * 만약 두 개의 값이 같으면 0이 되어 손익분기점이 발생하지 않으므로
         * 이익이 발생하지 않는 경우의 포함시켜 보면
         * productCost - variableCost <= 0 이고 수식을 줄이면
         * productCoast <= variableCost 로 정리된다.
         */

        if (productCost <= variableCost) {
            System.out.println("-1");
        } else {
            System.out.println(fixCost / (productCost - variableCost) + 1);
        }
    }
}

//        System.out.println(getBreakEvenPoint(fixCost, variableCost, productCost, 1));
//    static long getBreakEvenPoint(long fix, long variable, long product, long count){
//
//        long totalCost = fix + (variable * count);
//        long manufacturingCost = product * count;
//        long tmpCount = count;
//
//        if (totalCost < manufacturingCost){
//            return tmpCount;
//        }
//
//        tmpCount++;
//
//        return getBreakEvenPoint(fix, variable, product,  tmpCount);
//    }

