package ex3;

import domain.Apple;
import domain.Color;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static domain.Color.RED;

public class WeightLightSort {
    public static void main(String[] args) {
        Apple apple1 = new Apple(Color.GREEN, 151);
        Apple apple2 = new Apple(RED, 153);
        Apple apple3 = new Apple(Color.GREEN, 148);
        Apple apple4 = new Apple(Color.GREEN, 157);

        List<Apple> inventory = Arrays.asList(apple1, apple2, apple3, apple4);

        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        for (Apple apple : inventory) {
            System.out.println("apple.getWeight() = " + apple.getWeight());
        }

        inventory.sort((Apple o1, Apple o2) -> o1.getWeight() - o2.getWeight());
        inventory.sort(Comparator.comparingInt(Apple::getWeight));

    }
}
