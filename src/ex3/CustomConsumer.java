package ex3;

@FunctionalInterface
public interface CustomConsumer<T> {
    void accept(T t);
}
