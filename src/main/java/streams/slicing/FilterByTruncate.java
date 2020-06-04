package streams.slicing;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByTruncate {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        List<Food> vegetarianFoods = foods.stream()
                                                   .filter(Food::isVegetarian)
                                                   .limit(2)
                                                   .collect(Collectors.toList());

        vegetarianFoods.forEach(System.out::println);
    }
}
