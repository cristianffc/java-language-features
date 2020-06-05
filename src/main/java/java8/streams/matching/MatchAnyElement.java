package java8.streams.matching;

import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;

import java.util.List;

public class MatchAnyElement {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        if(foods.stream().anyMatch(food -> food.getType().equals(Type.FRUIT))) { //short-circuit operation
            System.out.println("Fruit exists!");
        }
    }
}
