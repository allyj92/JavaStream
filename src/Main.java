import java.util.*;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> bingPool = new ArrayList<>(75);

        int start = 1;
        for (char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++) {
                bingPool.add("" + c + i);
                System.out.println("" + c + i);
            }
            start += 15;
        }
        Collections.shuffle(bingPool);
        for (int i = 0; i < 15; i++) {
            System.out.println(bingPool.get(i));
        }
        System.out.println("-----------------------------------");

//        List<String> firstOnes = bingPool.subList(0, 15);
        List<String> firstOnes = new ArrayList<>(bingPool.subList(0, 15));
        firstOnes.sort(Comparator.naturalOrder());
        firstOnes.replaceAll(s -> {
            if (s.indexOf('G') == 0 || s.indexOf("O") == 0) {
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.println(updated + " ");
                return updated;
            }
            return s;
        });

        System.out.println("\n-------------------------------------");

        for (int i = 0; i < 15; i++) {
            System.out.println(bingPool.get(i));
        }
        System.out.println("-----------------------------------");

        var tempStream = bingPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf("O") == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted();
//                .forEach(s -> System.out.println(s + " "));

        tempStream.forEach(s -> System.out.print(s + " "));
        System.out.println("\n-----------------------------------");

        String[] strings = {"One", "Two", "Thee"};
        var firstStream = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());
//                .forEach(System.out::println);

        var secondStream = Stream.of("Six","Five","Four")
                .map(String::toUpperCase);
//                .forEach(System.out::println);

        Stream.concat(secondStream, firstStream)
                .map(s->s.charAt(0) + "-" + s)
                .forEach(System.out::println);
        }


    }



