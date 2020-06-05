package java8.lambda;

import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/**
    Target type: Function<T, R>
    Function descriptor: T -> R
**/

public class FunctionInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Function<Food, Type> typeFunction = food -> food.getType();

        Set<Type> foodTypeList = getFoodType(foods, typeFunction);

        System.out.println(foodTypeList);
    }

    public static <T, R> Set<R> getFoodType(List<T> list, Function<T, R> function) {
        Set<R> resultList = new HashSet<>();
        for(T t: list) {
            resultList.add(function.apply(t));
        }
        return resultList;
    }
}