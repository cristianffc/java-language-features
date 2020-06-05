package java8.streams.numeric;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamElement {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        IntStream calories = foods.stream().mapToInt(Food::getCalories);
        Stream<Integer> streams = calories.boxed();

        System.out.println(streams.collect(Collectors.toList()));
    }
}
