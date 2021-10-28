package task1;

import static java.lang.Integer.parseInt;

public class Task1 {
    static int numInLines;
    static int length;
    static String result = "";

    public static void main(String[] args) {
        length = parseInt(args[0]);
        numInLines = parseInt(args[1]);

        findWay(1);
        System.out.println(result);
    }

    public static void findWay(Integer prev) {
        result += prev.toString();
        for (int i = 0; i < numInLines - 1; i++) {
            prev++;
            if (prev == length + 1) prev = 1;
        }
        if (prev != 1) findWay(prev);
    }
}
