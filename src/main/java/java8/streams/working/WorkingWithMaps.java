package java8.streams.working;

import domain.entity.Color;
import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkingWithMaps {

    public static void main(String[] args) {
        Map<Type, Food> foods = GenerateFood.getFoodsByTypeMap();

        //Print all
        foods.forEach(((type, food) -> System.out.println(type + " - " + food)));
        System.out.println("Order by entry set");

        //Order by Entry set
        foods.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(System.out::println);

        //GetOrDefault
        Food tomato = new Food.Builder().withName("Tomato")
                .withCalories(10)
                .withType(Type.FRUIT)
                .withColor(Color.RED)
                .withVegetarian(true)
                .build();

        System.out.println("GetOrDefault");
        System.out.println(foods.getOrDefault("Vegetables", tomato));

        //Compute patterns
        Map<Type, Food> foodMap = new HashMap<>();
        Food onion = new Food.Builder().withName("Onion")
                .withCalories(10)
                .withType(Type.VEGETABLE)
                .withColor(Color.WHITE)
                .withVegetarian(true)
                .build();

        foodMap.computeIfAbsent(Type.VEGETABLE, type -> onion); ;
        System.out.println(foodMap);

    }
}
