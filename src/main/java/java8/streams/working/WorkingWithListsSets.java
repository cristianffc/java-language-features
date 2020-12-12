package java8.streams.working;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;

public class WorkingWithListsSets {

    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();
        foods.removeIf(Food::isVegetarian);
        System.out.println(foods);



    }
}
