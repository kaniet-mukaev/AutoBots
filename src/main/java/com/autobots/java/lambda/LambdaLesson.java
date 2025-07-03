package com.autobots.java.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaLesson {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("5 + 3 = " + addition.operation(5, 3));
        System.out.println("5 * 3 = " + multiply.operation(5, 3));

       // Принимает объект и возвращает boolean
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("Java"));

        Function<Integer, String> toStringFun = i -> "Число: " + i;
        System.out.println(toStringFun.apply(10));

        Consumer<String> print = s -> System.out.println("Writing: " + s);
        print.accept("Hi");
    }
    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s.replace("x", ""))
                .collect(Collectors.toList());
    }
}
