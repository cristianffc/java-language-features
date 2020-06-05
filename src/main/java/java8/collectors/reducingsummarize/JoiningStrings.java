package java8.collectors.reducingsummarize;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();
        String foodNames = foods.stream()
                            .map(Food::getName)
                            .collect(Collectors.joining());
        System.out.println(foodNames);

        String foodNamesDelimited = foods.stream()
                                    .map(Food::getName)
                                    .collect(Collectors.joining(" , "));
        System.out.println(foodNamesDelimited);
    }
}
