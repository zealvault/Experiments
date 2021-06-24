package calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    private List<String> memory = new ArrayList<>();

    public double add(float x, float y) {
        float result = x + y;
        addToMemory(x, y, result);
        return result;
    }


    public double divide(double x, double y) {
        double result = x / y;
        memory.add(String.format("%.1f / %.1f = %.1f", x, y, result));
        return result;
    }

    public String replay() {
        if(memory.isEmpty()){
            return "No Operations Performed";
        }
        return stringify(memory);
    }

    public String replayLast(int howMany) {
        if(memory.isEmpty()){
            return "Nothing To Replay";
        }
        List<String> reversed = reverse();
        return stringify(reversed.subList(0, howMany));
    }

    private void addToMemory(float x, float y, float result) {
        memory.add(String.format("%.1f + %.1f = %.1f", x, y, result));
    }

    private String stringify(List<String> memory) {
        return String.join("; ", memory);
    }

    private List<String> reverse() {
        List<String> reversed = new ArrayList<>(memory);
        Collections.reverse(reversed);
        return reversed;
    }
}
