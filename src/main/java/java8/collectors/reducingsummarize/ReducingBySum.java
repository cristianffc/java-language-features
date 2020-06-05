package java8.collectors.reducingsummarize;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;

public class ReducingBySum {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        int totalCalories = foods.stream()
                                 .collect(Collectors.reducing(0, Food::getCalories, Integer::sum));

        System.out.println(totalCalories);
    }
}
