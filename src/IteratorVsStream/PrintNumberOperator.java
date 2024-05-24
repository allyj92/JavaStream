package IteratorVsStream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PrintNumberOperator {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            int num = it.next();
            System.out.println(num);
        }
    }
}
