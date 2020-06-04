package lambda;

import domain.entity.Color;
import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;
import java.util.List;
import java.util.function.Supplier;

/**
    Target type: Supplier<T>
    Function descriptor: () -> T
**/

public class SupplierInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Supplier<Food> appleSupplier = () -> {
            return new Food("Apple", 50, Type.FRUIT, Color.RED, true);
        };

        Food apple = appleSupplier.get();
        System.out.println(apple);
        foods.add(apple);
     }
}