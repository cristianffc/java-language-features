package lambda;

import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;
import java.util.List;
import java.util.function.BiPredicate;

/**
    Target type: BiPredicate<T, U>
    Function descriptor: (T, U) -> boolean
**/

public class BiPredicateInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        BiPredicate<Type, Food> validateFoodByType = (type, food) -> {
            if(type.equals(food.getType())) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(foods.get(1)
                                .getName() + " is fruit ? " + validateFoodByType.test(Type.FRUIT, foods.get(1)));
        System.out.println(foods.get(2)
                                .getName() + " is fruit ? " + validateFoodByType.test(Type.FRUIT, foods.get(2)));
        System.out.println(foods.get(3)
                                .getName() + " is fruit ? " + validateFoodByType.test(Type.FRUIT, foods.get(3)));
        System.out.println(foods.get(4)
                                .getName() + " is fruit ? " + validateFoodByType.test(Type.FRUIT, foods.get(4)));
        System.out.println(foods.get(5)
                                .getName() + " is fruit ? " + validateFoodByType.test(Type.FRUIT, foods.get(5)));
    }
}