package StreamOperator.mediOperator.finalOperator;

import java.util.Arrays;

public class Match {
    public static void main(String[] args) throws Exception {
        int[] intArray = {2,4,6};

        boolean result = Arrays.stream(intArray).allMatch(element -> element % 2 ==0);
        System.out.println("요소 모두 2의 배수인가요? : " + result);

        result = Arrays.stream(intArray).anyMatch(element  -> element % 3 == 0);
        System.out.println("요소 중 하나라도 3의 배수가 있나요? : " + result);

        result = Arrays.stream(intArray).noneMatch(element -> element % 3 == 0);
        System.out.println("요소 중 3의 배수가 하나도 없나요? : " + result);
    }
}
