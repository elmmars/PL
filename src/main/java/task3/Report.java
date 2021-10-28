package task3;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Report {
    @SerializedName("id")
    String id;

    @SerializedName("title")
    String title;

    @SerializedName("value")
    String value;

    @SerializedName("value")
    Value[] values;

    @Override
    public String toString() {
        return "Report{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", values=" + Arrays.toString(values) +
                '}';
    }
}
