package task3;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        JsonReader readerValues = new JsonReader(new FileReader(args[0]));
        JsonReader readerTest = new JsonReader(new FileReader(args[1]));
        Values values = new Gson().fromJson(readerValues, Values.class);
        Test test = new Gson().fromJson(readerTest, Test.class);
        Report report = generateReport(values.getValues(), test);
        System.out.println(report);
    }

    //todo множественная вложенность
    static Report generateReport(Value[] fromValues, Test test) {
        Report report = new Report();
        report.id = test.id;
        report.title = test.title;
        report.value = findValue(fromValues, test.id).value;
        ArrayList<Value> reportValues = new ArrayList<>();

        //мерджим Value из Values и Test
        for (Value testValue : test.values) {
            Value mergedValue = findValue(fromValues, testValue.id);
            mergedValue.title = testValue.title;
            reportValues.add(mergedValue);
        }
        report.values = reportValues.toArray(new Value[0]);
        return report;
    }

    //поиск в Values объект value по id
    static Value findValue(Value[] values, String id) {
        return stream(values).filter(v -> v.id.equals(id)).collect(toList()).get(0);
    }
}
