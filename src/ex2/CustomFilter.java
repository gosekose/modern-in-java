package ex2;

import java.util.ArrayList;
import java.util.List;

public class CustomFilter<T> {

    public static <T> List<T> filter(List<T> inventory,
                                     CustomPredicate<T> customPredicate) {
        List<T> result = new ArrayList<>();
        for (T t : inventory) {
            if (customPredicate.test(t)) {
                result.add(t);
            }
        }

        return result;
    }
}
