import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapThings {
    public static void main(String[] args) {
        Map<String, Object> mapOfThings = new HashMap<>();
//        mapOfThings.put("oneThingKey", 1L);
//        mapOfThings.put("secondThingKey", 2L);
//        System.out.println(mapOfThings.get("blahblahblah"));
//
//        System.out.println((Optional.ofNullable(null)) == null);

        mapOfThings.put("nullKey", null);
        System.out.println(mapOfThings);

    }
}
