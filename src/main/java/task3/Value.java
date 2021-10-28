package task3;

import com.google.gson.annotations.SerializedName;

public class Value {
    @SerializedName("id")
    String id;

    @SerializedName("title")
    String title = "";

    @SerializedName("value")
    String value = "";

    @Override
    public String toString() {
        return "Value{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
