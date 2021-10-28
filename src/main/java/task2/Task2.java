package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;

public class Task2 {
    static float centerX;
    static float centerY;
    static float radius;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String[] first = reader.readLine().split("\\s");
            centerX = parseFloat(first[0]);
            centerY = parseFloat(first[1]);
            radius = parseFloat(reader.readLine());
        }
        ArrayList<Integer> result = new ArrayList<>();

        List<String> points = Files.readAllLines(Paths.get(args[1]));
        for (String line : points) {
            String[] arr = line.split("\\s");
            result.add(getResultCode(parseDouble(arr[0]), parseDouble(arr[1])));
        }

        for (Integer i : result) {
            System.out.println(i);
        }
    }

    static int getResultCode(double pointX, double pointY) {
        /**
         *  d = √ ( x2 - x1 )^2 + (y2 - y1 )^2
         */
        double distance = Math.sqrt(Math.pow(centerX - pointX, 2) + Math.pow(centerY - pointY, 2));

        if (distance == radius) {
            return 0;
        }
        if (distance < radius) {
            return 1;
        }
        if (distance > radius) {
            return 2;
        }
        return 3;
    }
}
