package com.james.api.proxy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MathProxy {
    public static Function<Integer, Integer> absInt = Math::abs;
    public static Function<Double, Double> absDouble = Math::abs;
    public static Function<Float, Float> absFloat = Math::abs;
    public static Function<Long, Long> absLong = Math::abs;


    public static BiFunction<Integer, Integer, Integer> maxInt = Math::max;
    public static BiFunction<Double, Double, Double> maxDouble = Math::max;
    public static BiFunction<Float, Float, Float> maxFloat = Math::max;
    public static BiFunction<Long, Long, Long> maxLong = Math::max;

    public static BiFunction<Integer, Integer, Integer> minInt = Math::min;
    public static BiFunction<Double, Double, Double> minDouble = Math::min;
    public static BiFunction<Float, Float, Float> minFloat = Math::min;
    public static BiFunction<Long, Long, Long> minLong = Math::min;


    public static BiFunction<Integer, Integer, Integer> randomInt = (a, b) -> (int) (Math.random() * (b-a) + a);
    public static BiFunction<Double, Double, Double> randomDouble = (a, b) -> (Double) (Math.random() * (b-a) + a);


    public static Supplier<Double> randomSupDouble = Math::random;

    public static Function<Double, Double> ceilInt = Math::ceil;

    public static Function<Double, Double> floorInt = Math::floor;

    public static Function<Float, Integer> roundInt = Math::round;

    public static Function<String, Integer> parseInt = Integer::parseInt;

    public static BiFunction<Integer, Integer, Integer> powInt = (a, b) -> (int) Math.pow(a, b);


}