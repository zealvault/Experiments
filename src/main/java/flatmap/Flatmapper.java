package flatmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Flatmapper {

    public static void main(String[] args) {
        List<List<String>> nestedList = asList(
                asList("one:one"),
                asList("two:one", "two:two", "two:three"),
                asList("three:one", "three:two", "three:three", "three:four"));


        final List<String> collect = nestedList.stream().flatMap((listOfStrings) -> listOfStrings.stream()).collect(Collectors.toList());

        System.out.println(collect);
    }

}
