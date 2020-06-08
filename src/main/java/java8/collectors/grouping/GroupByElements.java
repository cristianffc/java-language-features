package java8.collectors.grouping;

import domain.entity.Color;
import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class GroupByElements {
    public enum CALORIC_TYPE {DIET, FAT}

    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Map<Color, List<Food>> listFoodByColor = foods.stream().collect(groupingBy(Food::getColor));
        System.out.println("listFoodByColor ->" + listFoodByColor);

        Map<CALORIC_TYPE, List<Food>> listFoodByCaloricType = foods.stream()
                                                             .collect(groupingBy(food -> {
                                                                     if (food.getCalories() > 200) {
                                                                         return CALORIC_TYPE.FAT;
                                                                     } else {
                                                                         return CALORIC_TYPE.DIET;
                                                                     }
                                                                 }
                                                             ));
        System.out.println("listFoodByCaloricType ->" + listFoodByCaloricType);

        Map<CALORIC_TYPE, List<Food>> listVegetarianFoodByCaloricType = foods.stream()
                                                           .filter(food -> food.isVegetarian()).collect(groupingBy(
                                                                   food -> {
                                                                       if(food.getCalories() > 100) {
                                                                           return CALORIC_TYPE.FAT;
                                                                       } else {
                                                                           return CALORIC_TYPE.DIET;
                                                                       }
                                                                   }
                                                           ));
        System.out.println("listVegetarianFoodByCaloricType ->" + listVegetarianFoodByCaloricType);

        Map<Color, List<Food>> listFoodByColorAndCalories = foods.stream().filter(food -> food.getCalories() > 140)
                                                                    .collect(groupingBy(Food::getColor));
        System.out.println("listFoodByColorAndCalories ->" +listFoodByColorAndCalories);

        Map<Color, List<Food>> listFoodByColorAndCalories2 = foods.stream()
                                                                 .collect(groupingBy(
                                                                        Food::getColor, filtering(
                                                                        food -> food.getCalories() > 140, toList())
                                                                     )
                                                                 );
        System.out.println("listFoodByColorAndCalories2 ->" + listFoodByColorAndCalories2);
    }
}
