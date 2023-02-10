package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleTest {

    public interface Predicate<T> {
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple("Green", 150);
        Apple apple2 = new Apple("Red", 150);
        Apple apple3 = new Apple("Green", 152);

        List<Apple> inventory = Arrays.asList(apple1, apple2, apple3);

        filterApples(inventory, Apple::isGreenApple).stream().forEach(f -> System.out.println("f = " + f.getColor()));
        filterApples(inventory, Apple::isHeavyApple).stream().forEach(f -> System.out.println("f = " + f.getWeight()));
    }
}
