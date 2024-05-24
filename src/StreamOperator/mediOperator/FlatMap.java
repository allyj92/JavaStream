package StreamOperator.mediOperator;
import java.util.Arrays;

public class FlatMap {
    public static void main(String[] args) throws Exception {
        String[][] namesArray = new String[][]{{"박해커","이자바"},{"김코딩","나박사"}};
        Arrays.stream(namesArray).flatMap(Arrays::stream).forEach(System.out::println);
    }
}
