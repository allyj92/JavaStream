package StreamOperator.mediOperator;

import java.util.stream.IntStream;

public class Limit {
    public static void main(String[] args) {
        // 1~10 범위의 정수로 구성된 스트림 생성
        IntStream intStream = IntStream.rangeClosed(1,10);
        // 앞에서부터 5개의 숫자만 출력
        intStream.limit(5).forEach(System.out::println);
    }
}
