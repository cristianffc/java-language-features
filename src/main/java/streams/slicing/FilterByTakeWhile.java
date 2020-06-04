package streams.slicing;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class FilterByTakeWhile {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        foods.sort(comparing(Food::getCalories));

        List<Food> list = foods.stream()
                                       .takeWhile(food -> food.getCalories() < 125)
                                       .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
