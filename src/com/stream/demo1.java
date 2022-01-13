package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo1 {
    public static void main(String[] args) {


//        Random seed = new Random();
//        Supplier<Integer> random = Randk::nextInt;
        Supplier<Integer> random = new Random()::nextInt;

        Stream.generate(random).limit(10).forEach(System.out::println);
    }
}
//
//    final class Randk extends Random {
//        public static int nextInt() {
//            return 1;
//        }
//        }
