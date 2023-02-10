package ex2;

import domain.Apple;

public class CustomHeavyWeightPredicate implements CustomPredicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
