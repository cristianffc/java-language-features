package lambda;

import domain.entity.Food;
import domain.usecase.GenerateFood;
import java.util.List;
import java.util.function.UnaryOperator;

/**
    Target type: UnaryOperator<T>
    Function descriptor: T -> T
**/

public class UnaryOperatorInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        UnaryOperator<Integer> caloriesFor10UnitsOperator = (weight) -> {return weight * 10;};

        System.out.println(caloriesFor10UnitsOperator.apply(foods.get(0).getCalories()));
        System.out.println(caloriesFor10UnitsOperator.apply(foods.get(1).getCalories()));
        System.out.println(caloriesFor10UnitsOperator.apply(foods.get(2).getCalories()));
    }
}