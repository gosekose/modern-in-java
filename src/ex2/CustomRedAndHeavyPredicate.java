package ex2;

import domain.Apple;
import domain.Color;

public class CustomRedAndHeavyPredicate implements CustomPredicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return Color.RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
