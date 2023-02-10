package ex2;

import domain.Apple;
import domain.Color;

public class CustomGreenColorPredicate implements CustomPredicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}
