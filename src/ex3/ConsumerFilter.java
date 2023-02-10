package ex3;

import java.util.List;

public class ConsumerFilter {

    public <T> void forEach(List<T> list, CustomConsumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }
}
