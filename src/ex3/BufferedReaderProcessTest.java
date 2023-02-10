package ex3;

import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderProcessTest {

    public static void main(String[] args) {
        BufferedReaderProcessor bufferedReaderProcessor = bf -> bf.readLine() + bf.readLine();

        BufferedReaderProcessor bfp = bf -> bf.readLine();

    }
}
