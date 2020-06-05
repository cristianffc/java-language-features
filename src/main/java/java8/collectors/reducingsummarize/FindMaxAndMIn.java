package java8.collectors.reducingsummarize;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxAndMIn {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Comparator<Food> foodComparator = Comparator.comparingInt(Food::getCalories);
        Optional<Food> maxCalories = foods.stream().collect(Collectors.maxBy(foodComparator));
        System.out.println(maxCalories);

        Optional<Food> minCalories = foods.stream().collect(Collectors.minBy(foodComparator));
        System.out.println(minCalories);
    }
}
