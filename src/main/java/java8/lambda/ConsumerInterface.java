package java8.lambda;

import domain.entity.Food;
import domain.usecase.GenerateFood;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
    Target type: Consumer<T>
    Function descriptor: T -> void
**/

public class ConsumerInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Consumer<Food> foodConsumer = food -> {
            System.out.println(food.getName());
        };

        print(foods, foodConsumer);
    }

    public static <T> void print(List<T> list, Consumer<T> consumer) {
        List<T> results = new ArrayList();
        for (T t : list) {
            consumer.accept(t);
        }
    }
}