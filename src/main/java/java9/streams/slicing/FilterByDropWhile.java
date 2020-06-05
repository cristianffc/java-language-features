package java9.streams.slicing;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import static java.util.Comparator.comparing;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByDropWhile {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        foods.sort(comparing(Food::getCalories));

        List<Food> list = foods.stream()
                               .dropWhile(food -> food.getCalories() < 125)
                               .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
