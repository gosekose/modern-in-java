package ex3;

@FunctionalInterface
public interface CustomFunction<T, R> {

    R apply(T t);

}
