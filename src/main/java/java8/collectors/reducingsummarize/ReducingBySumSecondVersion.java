package java8.collectors.reducingsummarize;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import static java.util.stream.Collectors.*;

public class ReducingBySumSecondVersion {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        int totalCalories = foods.stream().collect(reducing(0, Food::getCalories, (i, j) -> i + j));

        System.out.println(totalCalories);
    }
}
