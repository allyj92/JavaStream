package StreamOperator.mediOperator;

import java.util.stream.IntStream;

public class Peek {
    public static void main(String[] args) {

        IntStream intStream3 = IntStream.of(1, 2, 2, 3, 3, 4, 5, 5, 7, 7, 7, 8);

        int sum = intStream3.filter(element -> element % 2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("합계 = " + sum);
    }
}
