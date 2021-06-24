package mapOperations;

import java.util.*;

public class Main {

    private static List<Pair> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(fact(50000));

        Map<Integer, List<Character>> map = new HashMap<>();
        map.put(1, Arrays.asList('a', 'b', 'c', 'd'));
        map.put(2, Arrays.asList('e', 'f', 'g', 'h'));

        result = recursive(map);
        System.out.println(result);

    }

    private static Map<Integer, Character> toMap(int currentIndex, Map.Entry<Integer, List<Character>> entrySet) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(entrySet.getKey(), entrySet.getValue().get(currentIndex));
        return map;
    }

    private static List<Map<Integer, Character>> pattern(int currentIndex, Set<Map.Entry<Integer, List<Character>>> entries, List<Map<Integer, Character>> collect) {
        List<Character> characters = entries.stream().findFirst()
                .map(entry -> entry.getValue())
                .orElse(Collections.emptyList());
        if(currentIndex >= characters.size()) {
            return collect;
        }
        entries.stream()
                .map(entry -> toMap(currentIndex, entry))
                .forEach(map -> collect.add(map));
        return pattern(currentIndex+1, entries, collect);
    }

    private static List<Pair> recursive(Map<Integer, List<Character>> map){

        if(map.entrySet().stream().allMatch(entrySet -> entrySet.getValue().size() == 0)){
            return result;
        }

        map.forEach((key, value) -> {
            result.add(new Pair(key, value.get(0)));
            map.replace(key, value.subList(1, value.size()));
        });

        return recursive(map);
    }

    public static double fact (int a) {
       return fact(0, a);
    }


    public static double fact(double accu, int a) {
        if(a< 1) {
            return accu;
        }
        return fact(accu + a, a-1);
    }

}
