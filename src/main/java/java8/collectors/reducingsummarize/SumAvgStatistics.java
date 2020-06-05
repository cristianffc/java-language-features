package java8.collectors.reducingsummarize;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.*;
import static java.util.stream.Collectors.*;

public class SumAvgStatistics {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        int sumCalories = foods.stream().collect(summingInt(Food::getCalories));
        System.out.println(sumCalories);

        double averageCalories = foods.stream().collect(averagingInt(Food::getCalories));
        System.out.println(averageCalories);

        IntSummaryStatistics menuStatistics = foods.stream().collect(summarizingInt(Food::getCalories));
        System.out.println(menuStatistics);
    }
}
