package CollectionStream;
import java.util.stream.IntStream;

public class StreamCreatorRandomInt {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,10);
        intStream.forEach(System.out::println);
    }
}
