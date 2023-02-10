package ex3;

import java.util.ArrayList;
import java.util.List;

public class CustomFunctionFilter {

    public <T, R> List<R> map(List<T> list, CustomFunction<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
