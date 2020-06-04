package collectors.grouping;

import domain.entity.Color;
import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class MultiLevelGroup {
    public enum CALORIC_TYPE {DIET, FAT}

    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();
        Map<Color, Map<CALORIC_TYPE, List<Food>>> mapFoodByType =
                foods.stream()
                     .collect(groupingBy(Food::getColor, groupingBy(food -> {
                         if (food.getCalories() >= 200) {
                             return CALORIC_TYPE.FAT;
                         } else {
                             return CALORIC_TYPE.DIET;
                         }
                     })));
        System.out.println(mapFoodByType);
    }
}
