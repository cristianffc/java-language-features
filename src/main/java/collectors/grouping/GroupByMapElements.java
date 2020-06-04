package collectors.grouping;

import domain.entity.Color;
import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class GroupByMapElements {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Map<Color, List<String>> mapFoodByColor = foods.stream()
                                                       .collect(groupingBy(Food::getColor,
                                                               mapping(Food::getName, toList())));

        System.out.println(mapFoodByColor);
    }
}
