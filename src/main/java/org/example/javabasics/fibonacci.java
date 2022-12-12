package org.example.javabasics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fibonacci {
    public static void main(String[] args) {
        //without collect
        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(10)
                .map(n -> n[0])
                .forEach(t -> System.out.println(t));

        //Using collect
//        List<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
//                .limit(10)
//                .map(t -> t[0])
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        collect.forEach(x -> System.out.print(x+" "));


        int sum = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0])
                .mapToInt(Integer::intValue)
// alternate for above code ==> .mapToInt(i -> i.intValue())
                .sum();
        System.out.println("Sum of fibonacci numbers = "+sum);

        //for how iterate works with array.
//        List<int[]> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
//                .limit(10)
//                .collect(Collectors.toList());
//        collect.forEach(x -> System.out.println("{"+x[0]+" , "+x[1]+"}"));
    }
}
