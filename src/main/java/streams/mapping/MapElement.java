package streams.mapping;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;

public class MapElement {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        List<Integer> foodNamesLength = foods.stream()
                                            .map((Food food) -> food.getName())
                                            .map(String::length)
                                            .collect(Collectors.toList());

        foodNamesLength.forEach(System.out::println);
    }
}