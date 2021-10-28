package task3;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Values {
    @SerializedName("values")
    Value[] values;

    public Value[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "Values{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
