package org.example.javabasics;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        Stream.iterate(0,n->n+1)
                .limit(12)
                .filter(PrimeNumber::isPrime)
                .forEach(x -> System.out.println(x));
    }
    public static boolean isPrime(int number){
        if (number <= 1) return false;

        return !IntStream.rangeClosed(2,number/2).anyMatch(i -> number % i == 0);
    }
}
