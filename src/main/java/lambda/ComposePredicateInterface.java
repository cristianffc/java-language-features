package lambda;

import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.function.Predicate;

public class ComposePredicateInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Food food0 = foods.get(0);

        Predicate<Food> isLemonPredicate = food -> food.getName()
                                                       .equals("Lemon");

        Predicate<Food> isNotLemonPredicate = isLemonPredicate.negate();

        Predicate<Food> isNotLemonAndIsGrainPredicate = isNotLemonPredicate.and(food -> food.getType()
                                                                                            .equals(Type.FRUIT));

        System.out.println(food0.getName() + " is lemon ? " + isLemonPredicate.test(food0));
        System.out.println(food0.getName() + " is not lemon ? " + isNotLemonPredicate.test(food0));
        System.out.println(food0.getName() + " is not lemon and is fruit ? " + isNotLemonAndIsGrainPredicate.test(food0));
    }
}