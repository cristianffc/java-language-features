package lambda;

import domain.entity.Food;
import domain.usecase.GenerateFood;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
    Target type: Predicate<T>
    Function descriptor: T -> boolean
**/

public class PredicateInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Predicate<Food> isVegetarian = food -> {
            if(food.isVegetarian()) {
                return true;
            } else {
                return false;
            }
        };

        List<Food> vegetarianFoods = predicate(foods, isVegetarian);
        System.out.println(vegetarianFoods);
    }

    public static <T> List<T> predicate(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}