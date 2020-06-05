package java8.streams.matching;

import domain.entity.Food;
import domain.usecase.GenerateFood;
import java.util.List;

public class MatchAllElements {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();
        
        if(foods.stream().allMatch(food -> food.getCalories() <= 400)) { //short-circuit operation
            System.out.println("All foods have calories less than 400");
        }
    }
}