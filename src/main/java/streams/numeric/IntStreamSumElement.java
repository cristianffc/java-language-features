package streams.numeric;

import domain.entity.Food;
import domain.usecase.GenerateFood;
import java.util.List;

public class IntStreamSumElement {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        int sumCalories = foods.stream().mapToInt(Food::getCalories).sum();

        System.out.println(sumCalories);
    }
}
