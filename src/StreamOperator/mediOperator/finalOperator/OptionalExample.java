package StreamOperator.mediOperator.finalOperator;
import java.util.Optional;

public class OptionalExample {
    public Integer findElement(Integer[] arr, int x){
//        for(Integer num : arr){
//            if (num == x){
//                return Optional.of(x);
//            }
//        }
//
//        return Optional.empty();

}

public static void main(String[] args){
    Optional<Integer> numExists = Optional.of(5);
    Optional<Integer> numDoesNotExist = Optional.empty();

//    if(numExists.isPresent()){
//        System.out.println(numExists.get());
//    }
//
//    if(numDoesNotExist.isPresent()){
//        System.out.println(numDoesNotExist.get());
//    }
    numExists.ifPresent(System.out::println);
    numDoesNotExist.ifPresent(System.out::println);
}
}
