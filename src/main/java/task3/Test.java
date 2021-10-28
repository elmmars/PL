package task3;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Test {
    @SerializedName("id")
    String id;

    @SerializedName("title")
    String title;

    @SerializedName("value")
    String value = "";

    @SerializedName("values")
    Value[] values = null;

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", values=" + Arrays.toString(values) +
                '}';
    }
}
