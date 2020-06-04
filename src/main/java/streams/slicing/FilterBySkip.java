package streams.slicing;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.stream.Collectors;

public class FilterBySkip {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        List<Food> list = foods.stream().filter(Food::isVegetarian).skip(4).collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
