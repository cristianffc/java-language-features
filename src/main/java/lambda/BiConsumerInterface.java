package lambda;

import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;
import java.util.HashMap;

/**
 * Target type: BiConsumer<T, U>
 * Function descriptor: (T, U) -> ()
 */

public class BiConsumerInterface {
    public static void main(String[] args) {
        HashMap<Type, Food> foods = GenerateFood.getFoodsByTypeMap();

        foods.forEach((type, food) -> {
            if (type.equals(Type.FRUIT)) {
                System.out.println("Fruit Type - Food: " + food.getName());
            }
        });
    }
}