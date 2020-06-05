package java8.streams.numeric;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.OptionalInt;

public class OptionalElement {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        OptionalInt maxCalories = foods.stream().mapToInt(Food::getCalories).max();

        System.out.println(maxCalories.orElse(1));
    }
}
