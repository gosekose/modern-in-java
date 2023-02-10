package ex3;

import java.util.Arrays;
import java.util.List;

public class CustomFunctionTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("test1", "test2", "lambdaTest1");

        CustomFunctionFilter customFunctionFilter = new CustomFunctionFilter();

        List<Integer> map = customFunctionFilter.map(names, (String s) -> s.length());
        for (Integer integer : map) {
            System.out.println("integer = " + integer);
        }
    }
}
