package java8.streams.working;

import domain.entity.Color;
import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class WorkingWithMaps {

    public static void main(String[] args) {
        Map<Type, Food> foods = GenerateFood.getFoodsByTypeMap();

        //Print all
        foods.forEach(((type, food) -> System.out.println(type + " - " + food)));
        System.out.println("Order by entry set");

        //Order by Entry set
        System.out.println("Sort");
        foods.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(System.out::println);

        //GetOrDefault
        System.out.println("GetOrDefault");
        Food tomato = new Food.Builder().withName("Tomato")
                .withCalories(10)
                .withType(Type.FRUIT)
                .withColor(Color.RED)
                .withVegetarian(true)
                .build();

        System.out.println(foods.getOrDefault("Vegetables", tomato));

        //Compute patterns
        System.out.println("Compute patterns");
        Map<Type, Food> foodMap = new HashMap<>();
        final Food onion = new Food.Builder().withName("Onion")
                .withCalories(10)
                .withType(Type.VEGETABLE)
                .withColor(Color.WHITE)
                .withVegetarian(true)
                .build();

        foodMap.computeIfAbsent(Type.VEGETABLE, type -> onion);
        ;
        System.out.println(foodMap);

        //Remove patterns
        System.out.println("Remove patterns");
        foods.remove(Type.VEGETABLE);
        System.out.println(foods);

        //Replacement patterns
        System.out.println("Replacement patterns - replaceAll");
        foods = GenerateFood.getFoodsByTypeMap();
        foods.replaceAll((type, food) -> onion);
        System.out.println(foods);

        System.out.println("Replacement patterns - putAll");
        Food hamburger = new Food.Builder().withName("Hamburger")
                .withCalories(300)
                .withType(Type.MEAT)
                .withColor(Color.BROWN)
                .withVegetarian(false)
                .build();
        Food lasagne = new Food.Builder().withName("Lasagne")
                .withCalories(350)
                .withType(Type.PROCESSED)
                .withColor(Color.YELLOW)
                .withVegetarian(false)
                .build();
        Map<Type, Food> newFoods = Map.of(Type.PROCESSED, lasagne);
        Map<Type, Food> newFoods2 = Map.of(Type.MEAT, hamburger);
        Map<Type, Food> everyone2 = new HashMap<>(newFoods);
        everyone2.putAll(newFoods2);
        System.out.println(everyone2);

        System.out.println("Replacement patterns - merge");
        Map<String, String> family = Map.ofEntries(
                entry("Teo", "Star Wars"), entry("Cristina", "James Bond"));
        Map<String, String> friends = Map.ofEntries(
                entry("Raphael", "Star Wars"), entry("Cristina", "Matrix"));
        Map<String, String> everyone = new HashMap<>(family);
        friends.forEach((k, v) ->
                everyone.merge(k, v, (movie1, movie2) -> movie1 + " & " + movie2));
        System.out.println(everyone);
    }
}
