package CollectionStream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamCreator2 {
    public static void main(String[] args) {
        IntStream ints = new Random().ints().limit(5);
        ints.forEach(System.out::println);
    }
}
