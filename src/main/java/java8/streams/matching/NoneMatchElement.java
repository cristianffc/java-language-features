package java8.streams.matching;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;

public class NoneMatchElement {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        if(foods.stream().noneMatch(food -> food.getCalories() < 10)) { //short-circuit operation
            System.out.println("All foods above 10");
        }
    }
}
