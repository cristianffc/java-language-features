package java8.streams.filtering;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;

public class FilterUniqueElements {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        List<Food> filterOnlyVegetarianFood = foods.stream()
                                                   .filter(Food::isVegetarian)
                                                   .distinct()
                                                   .collect(Collectors.toList());

        filterOnlyVegetarianFood.forEach(System.out::println);
    }
}