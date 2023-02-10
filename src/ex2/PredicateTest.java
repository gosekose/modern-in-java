package ex2;

import domain.Apple;
import domain.Color;

import java.util.Arrays;
import java.util.List;

import static domain.Color.RED;

public class PredicateTest {

    public static void main(String[] args) {
        Apple apple1 = new Apple(Color.GREEN, 151);
        Apple apple2 = new Apple(RED, 153);
        Apple apple3 = new Apple(Color.GREEN, 148);
        Apple apple4 = new Apple(Color.GREEN, 157);

        List<Apple> inventory = Arrays.asList(apple1, apple2, apple3, apple4);

        CustomFilter.filter(inventory, new CustomPredicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return RED.equals(apple.getColor());
            }
        });

        CustomFilter.filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));

    }
}
