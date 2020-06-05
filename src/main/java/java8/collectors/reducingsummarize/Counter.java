package java8.collectors.reducingsummarize;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;

public class Counter {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        System.out.println(foods.stream().collect(Collectors.counting()));
        System.out.println(foods.stream().count());
    }
}
