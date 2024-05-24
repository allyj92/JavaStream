package StreamOperator.mediOperator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) throws Exception {
        List<String> animals = Arrays.asList("Tiger","Lion", "Monkey","Duck","Horse","Cow");

        animals.stream().sorted().forEach(System.out::println);

        // 역순으로 정렬
        animals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
