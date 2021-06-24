import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {

        List<String> input = new ArrayList<>();
        input.forEach(s -> {
            String buffer = s;
            Arrays.sort(s.toCharArray());
        });
    }

}
