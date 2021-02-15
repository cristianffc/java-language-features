package java8.streams.working;

import domain.entity.Color;
import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;

import java.util.List;

//Mutate the collection itself
public class WorkingWithListsSets {

    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        foods.removeIf(Food::isVegetarian);
        System.out.println(foods);

        List<Food> newFoods = GenerateFood.getFoodsList();
        newFoods.replaceAll(food -> new Food.Builder().withName("Lemon")
                .withCalories(10)
                .withType(Type.FRUIT)
                .withColor(Color.GREEN)
                .withVegetarian(true)
                .build());

        System.out.println(newFoods);

    }
}
