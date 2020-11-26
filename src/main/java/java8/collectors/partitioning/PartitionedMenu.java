package java8.collectors.partitioning;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

public class PartitionedMenu {

    public static void main(String[] args) {
        Map<Boolean, List<Food>> partitionedMenu =
                GenerateFood.getFoodsList().stream().collect(partitioningBy(Food::isVegetarian));

        System.out.println(partitionedMenu);

        List<Food> vegetarianFood = partitionedMenu.get(true);

        System.out.println("Vegetarian Food" + vegetarianFood);

        //Same result as the others above
        List<Food> vegetarianDishes =
                GenerateFood.getFoodsList().stream().filter(Food::isVegetarian).collect(Collectors.toList());
    }

}
