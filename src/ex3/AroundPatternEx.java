package ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AroundPatternEx {

    public static String processFile() throws IOException {
        try (BufferedReader bf = new BufferedReader(new FileReader("data.txt"))) {
            return bf.readLine();
        }
    }
}
