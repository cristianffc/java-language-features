package domain.usecase;

import domain.entity.Color;
import domain.entity.Food;
import domain.entity.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenerateFood {

    public static List<Food> getFoodsList() {
        Food pizza = new Food.Builder().withName("Pizza")
                                       .withCalories(266)
                                       .withType(Type.PROCESSED)
                                       .withColor(Color.YELLOW)
                                       .withVegetarian(false)
                                       .build();

        Food nuggets = new Food.Builder().withName("Nuggets")
                                         .withCalories(300)
                                         .withType(Type.PROCESSED)
                                         .withColor(Color.YELLOW)
                                         .withVegetarian(false)
                                         .build();

        Food banana = new Food.Builder().withName("Banana")
                                        .withCalories(86)
                                        .withType(Type.FRUIT)
                                        .withColor(Color.YELLOW)
                                        .withVegetarian(true)
                                        .build();

        Food lemon = new Food.Builder().withName("Lemon")
                                       .withCalories(10)
                                       .withType(Type.FRUIT)
                                       .withColor(Color.GREEN)
                                       .withVegetarian(true)
                                       .build();

        Food onion = new Food.Builder().withName("Onion")
                                       .withCalories(40)
                                       .withType(Type.VEGETABLE)
                                       .withColor(Color.WHITE)
                                       .withVegetarian(true)
                                       .build();

        Food broccoli = new Food.Builder().withName("Broccoli")
                                          .withCalories(34)
                                          .withType(Type.VEGETABLE)
                                          .withColor(Color.GREEN)
                                          .withVegetarian(true)
                                          .build();

        Food bean = new Food.Builder().withName("Bean")
                                      .withCalories(60)
                                      .withType(Type.GRAIN)
                                      .withColor(Color.BROWN)
                                      .withVegetarian(true)
                                      .build();

        Food rice = new Food.Builder().withName("Rice")
                                      .withCalories(130)
                                      .withType(Type.GRAIN)
                                      .withColor(Color.WHITE)
                                      .withVegetarian(true)
                                      .build();

        Food chicken = new Food.Builder().withName("Chicken")
                                         .withCalories(239)
                                         .withType(Type.MEAT)
                                         .withColor(Color.WHITE)
                                         .withVegetarian(false)
                                         .build();

        Food beef = new Food.Builder().withName("Beef")
                                      .withCalories(171)
                                      .withType(Type.MEAT)
                                      .withColor(Color.RED)
                                      .withVegetarian(false)
                                      .build();

        List<Food> list = new ArrayList<>();
        list.add(banana);
        list.add(lemon);
        list.add(pizza);
        list.add(nuggets);
        list.add(rice);
        list.add(bean);
        list.add(chicken);
        list.add(beef);
        list.add(onion);
        list.add(broccoli);

        return list;
    }

    public static HashMap<Type, Food> getFoodsByTypeMap() {
        HashMap<Type, Food> foodsByTypeMap = new HashMap<>();
        Food pizza = new Food.Builder().withName("Pizza")
                                       .withCalories(266)
                                       .withType(Type.PROCESSED)
                                       .withColor(Color.YELLOW)
                                       .withVegetarian(false)
                                       .build();

        Food banana = new Food.Builder().withName("Banana")
                                        .withCalories(86)
                                        .withType(Type.FRUIT)
                                        .withColor(Color.YELLOW)
                                        .withVegetarian(true)
                                        .build();

        Food onion = new Food.Builder().withName("Onion")
                                       .withCalories(40)
                                       .withType(Type.VEGETABLE)
                                       .withColor(Color.WHITE)
                                       .withVegetarian(true)
                                       .build();

        Food bean = new Food.Builder().withName("Bean")
                                      .withCalories(60)
                                      .withType(Type.GRAIN)
                                      .withColor(Color.BROWN)
                                      .withVegetarian(true)
                                      .build();

        Food chicken = new Food.Builder().withName("Chicken")
                                         .withCalories(239)
                                         .withType(Type.MEAT)
                                         .withColor(Color.WHITE)
                                         .withVegetarian(false)
                                         .build();

        foodsByTypeMap.put(pizza.getType(), pizza);
        foodsByTypeMap.put(banana.getType(), banana);
        foodsByTypeMap.put(onion.getType(), onion);
        foodsByTypeMap.put(bean.getType(), bean);
        foodsByTypeMap.put(chicken.getType(), chicken);

        return foodsByTypeMap;
    }
}