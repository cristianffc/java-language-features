package java8.collectors.partitioning;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class MostCaloric {

    public static void main(String[] args) {
        Map<Boolean, Food> mostCaloricPartitionedByVegetarian =
                GenerateFood.getFoodsList()
                            .stream()
                            .collect(
                                    partitioningBy(Food::isVegetarian,
                                            collectingAndThen(maxBy(comparingInt(Food::getCalories)),
                                                    Optional::get)));

        System.out.println(mostCaloricPartitionedByVegetarian);
    }

}
