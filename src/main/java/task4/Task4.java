package task4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Task4 {
    public static void main(String[] args) throws IOException {
        //     Тестовый массив
        //     Integer[] numArray = {1, 10, 2, 9};

        List<String> lines = readAllLines(Paths.get(args[0]));
        Integer[] numArray = new Integer[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            numArray[i] = Integer.parseInt(lines.get(i));
        }
        Arrays.sort(numArray);
        Integer median = getMedian(numArray);
        int result = 0;
        for (Integer num : numArray) {
            result += num > median ? num - median : median - num;
        }
        System.out.println(result);
    }

    static Integer getMedian(Integer[] array) {
        int middle = array.length / 2;
        int medianValue = 0;
        if (array.length % 2 == 1)
            medianValue = array[middle];
        else
            medianValue = (array[middle - 1] + array[middle]) / 2;
        return medianValue;
    }
}
